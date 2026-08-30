import java.util.Scanner;
public class PrimeFactorization 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("How many numbers do you want to process? ");
		int count = input.nextInt();

		int[] numbers = new int[count];

		for (int i = 0; i < count; i++) 
		{
		System.out.print("Enter #" + (i + 1) + ": ");
		numbers[i] = input.nextInt();
		}//for

		System.out.println("\nPrime Factorization Report:");
		for (int number : numbers) 
		{
			System.out.println("For " + number + ":");
			if (isPrime(number)) 
			{
				System.out.println(number + " is a prime number.\n");
			}//if
			else 
			{
				System.out.print("Prime Factors: ");
				primeFactorization(number);
				System.out.println("\n"); 
			}//else
		}//enhanced for

	}//main

	public static boolean isPrime(int number) 
	{
		if (number <= 1) 
		{
			return false;
		}//if

		for (int i = 2; i <= Math.sqrt(number); i++) 
		{
			if (number % i == 0) 
			{
				return false;
			}//if
		}//for
		return true;
	}//isPrime

	public static void primeFactorization(int number) 
	{
		boolean first = true; 
						//e.g:number=12
		for (int i = 2; i <= number; i++) 		//i=2=>3	2<=12
		{
			while (number % i == 0) 	//12%2=0=>6%2=0=>3%2=0(false)
						//3%3=0=>1%3=0(false)
						//.....
			{
				if (!first) 			
				{
					System.out.print(", ");
				}//if

				System.out.print(i);	//2,2,3
				first = false;
				number /= i;	//12/2=6=>6/2=3=>3/3=1
			}//while
		}//for
	}//primeFactorization
}//class
