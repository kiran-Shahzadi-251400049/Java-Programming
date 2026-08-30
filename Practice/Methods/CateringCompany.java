import java.util.Scanner;
public class CateringCompany
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of guests: ");
		int guests = input.nextInt();

		System.out.print("Enter price of coke per bottle: ");
		double priceOfCoke = input.nextDouble();	

		int cokeRequired = cokeRequired(guests);
		System.out.println("Number of bottles of coke required: "+ cokeRequired);

		double hoursOfService = hoursOfService(guests)  ;
		System.out.println("The hours of service required: "+ hoursOfService);	

		double costOfCoke = costOfCoke(cokeRequired, priceOfCoke) ;
		System.out.println("The cost of the coke : "+ costOfCoke);

		double serviceCharges = serviceCharges(hoursOfService) ;
		System.out.println("Service charges: "+ serviceCharges);

		double totalCost = totalCost(serviceCharges, costOfCoke)  ;
		System.out.println("Total cost of the catering job: "+ totalCost);

	}//main

	public static int cokeRequired(int guests) 
	{
		return guests/2;
	}//cokeRequired

	//The hours of service required 
	public static double hoursOfService(int guests) 
	{
		double servicePerPerson = 3.0/10.0;	// for every 10 guests 3 hours of  service will be required
		return servicePerPerson*guests;
	}//hoursOfService

	public static double costOfCoke(int cokeRequired, double priceOfCoke) 
	{
		return cokeRequired*priceOfCoke;
	}//costOfCoke

	public static double serviceCharges(double hoursOfService) 
	{
		return hoursOfService*25.00;
	}//serviceCharges

	public static double totalCost(double serviceCharges, double costOfCoke) 
	{
		return serviceCharges+costOfCoke;
	}//totalCost

}//class