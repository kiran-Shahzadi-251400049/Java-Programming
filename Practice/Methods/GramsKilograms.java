import java.util.Scanner;
public class GramsKilograms
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of grams: ");
		int grams = input.nextInt();

		double result= gramsToKilograms(grams);

		if(result<0)
		{
			System.out.print("Input was incorrect");
		}//if

		else
		{
			System.out.print(grams+ " Grams = "+ result+" kilograms.");
		}//else

	}//main

	public static double gramsToKilograms(int grams)
	{
		double kilograms = grams/1000.0;	//or double kilograms = (double)grams/1000;

		if(grams<0)
		{
			return -1.00;
		}//if

		else
		{
			return kilograms;
		}//else

	}//gramsToKilograms
}