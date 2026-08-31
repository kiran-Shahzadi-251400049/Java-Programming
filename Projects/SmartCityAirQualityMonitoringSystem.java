import java.util.Scanner;
import java.util.Arrays;
public class SmartCityAirQualityMonitoringSystem{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("\nProgram Started...\n");

		System.out.print("Enter number of AQI readings: ");
		int n = input.nextInt();
		float [] data=loadAQIData(n, input);
		
		System.out.print("\nProcessing data...\n");

		int [] surges=detectSurges(data);
		System.out.print("\nDetecting pollution surges...\n");
		for(int i=0; i<surges.length; i++){
			System.out.print("\nSurge found at index "+surges[i]);
		}//for 

		System.out.print("\n\nGenerating reports...\n");
		displayReport(data, surges);
		System.out.println("\nProgram ended successfully.");
		
	}//main

	public static float[] loadAQIData(int n, Scanner input){
		System.out.print("Enter AQI values: ");
		
		float [] data = new float[n];

		for(int i=0; i<data.length; i++){
			data[i]=input.nextInt();
		}//for

		return data;
	}//loadAQIData

	public static int[] detectSurges(float[] data){
		int count=0, index=0;

		for(int i=1; i<data.length-1; i++){
			if(data[i]>=(data[i+1]+15)&&data[i]>=(data[i-1]+15)){
				count++;
			}//if
		}//for

		int [] surges=new int[count];

		for(int i=1; i<data.length-1; i++){
			if(data[i]>=(data[i+1]+15)&&data[i]>=(data[i-1]+15)){
				surges[index]=i;
				index++;
			}//if
		}//for
		return surges;
	}//detectSurges

	public static String classifyAQI(float floatValue){
		String stringValue="";
		if(floatValue>=0 && floatValue<=50){
			stringValue="Good";
		}
		else if(floatValue>50 && floatValue<=100){
			stringValue="Moderate";
		}
		else if(floatValue>100 && floatValue<=150){
			stringValue="Unhealthy";
		}
		else if(floatValue>150){
			stringValue="Hazardous";
		}
		return stringValue;
	}//classifyAQI

	public static String generateAlert(String stringValue){
		String alert=null;
		if(stringValue.equals("Good")){
			alert="Safe to go outside";
		}
		else if(stringValue.equals("Moderate")){
			alert="Wear mask";
		}
		else if(stringValue.equals("Unhealthy")){
			alert="“Avoid outdoor activity";
		}
		else if(stringValue.equals("Hazardous")){
			alert="Emergency: Stay indoors";
		}
		return alert;
	}//generateAlert

	public static void displayReport(float[] data, int[] surges){

		//AQI VALUE
		float floatValue=0;
		String stringValue=null,alert=null;
		for(int i=0; i<surges.length; i++){
			System.out.print("\n-------------------------------------------------\n");

			System.out.print("Index: "+surges[i]);

			floatValue=data[surges[i]];
			System.out.print(" | AQI: "+floatValue);

			stringValue=classifyAQI(floatValue);
			System.out.print(" | Category: " +stringValue);

			alert=generateAlert(stringValue);
			System.out.print(" | Alert: " +alert);

			System.out.print("\n-------------------------------------------------\n");			
		}

		System.out.print("\nTotal surges detected: " +surges.length +"\n");

	}//displayReport

}//class