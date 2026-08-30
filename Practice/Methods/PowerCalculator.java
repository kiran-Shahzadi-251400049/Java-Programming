import java.util.Scanner;
public class PowerCalculator
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter base number(intergers only): ");
		int base = input.nextInt();

		System.out.print("Enter number for power(intergers only): ");
		int power = input.nextInt();

		double result= power(base, power);

		if(result<0)
		{
			System.out.print("Input was incorrect");
		}//if

		else
		{
			System.out.print(base+ " raised to the power of "+ power+" : "+result);
		}//else

	}//main

	public static double power(int base, int power)
	{
		double calculation = Math.pow(base,power);

		if(base<0 || power<0)
		{
			return -999.99;
		}//if

		else
		{
			return calculation;
		}//else

	}//power
}