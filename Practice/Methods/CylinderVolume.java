import java.util.Scanner;
public class CylinderVolume
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		double radius =0,height=0;

		do{
		System.out.print("Enter radius of cylinder(positive value only): ");
		radius = input.nextDouble();	
		}while(radius<0);	

		do{
		System.out.print("Enter height of cylinder(positive value only): ");
		height = input.nextDouble();
		}while(height<0);

		double result = calculateCylinderVolume(radius, height);

		System.out.print("Volume of cylinder: "+ result);
	

	}//main

	public static double calculateCylinderVolume(double radius, double height) 
	{
		
		double volume = Math.PI*Math.pow(radius, 2)*height;
		return volume;


	}//isSpecialSymbol
}//class