import java.util.Scanner;
public class  ArrayPrintPrimes
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int [] arr = new int[9];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter element #" +(i+1)  +": ");
			arr[i]=input.nextInt();
		}//for
		printPrimes(arr);
	}//main

	public static boolean isPrime(int number)
	{
		if(number<=1)
		{
			return false;
		}
		for(int i=2; i<number; i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;

	}//isPrime


	public static void printPrimes(int[] arr)
	{
		System.out.print("Prime numbers are: ");
		for(int i=0; i<arr.length; i++)
		{
			if(isPrime(arr[i]))
			{
				System.out.print(arr[i]+" ");
			}
		}//for
	
	}//printprimes

}//class