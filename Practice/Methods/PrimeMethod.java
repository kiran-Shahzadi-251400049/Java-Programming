import java.util.Scanner;

public class PrimeMethod
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		while(num<2)
		{
			System.out.print("Enter a number: ");
			num = input.nextInt();
		}//while

		isPrime(num);
	}//main

	public static void isPrime(int num)
	{
		if(num==2)
		{
			System.out.print("Number is Prime.");
		}//if

		else
		{
			int lcv=2;
				if(num%lcv==0)
				{
					System.out.print("Number is Composite.");
				}//if

				else
				{
					System.out.print("Number is Prime.");
				}//else	

		}//else

	}//isPrime
}//class