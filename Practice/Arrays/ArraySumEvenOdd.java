import java.util.Scanner;
public class  ArraySumEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int [] arr = new int[9];
		System.out.println("Enter 9 elements of array:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=input.nextInt();
		}//for
		sumEvenOdd(arr);
	}//main

	public static void sumEvenOdd(int[] arr)
	{
		int evenSum=0, oddSum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				evenSum+=arr[i];
			}
			else
			{
				oddSum+=arr[i];
			}
		}//for
		System.out.println("Sum of all even numbers: "+evenSum);
		System.out.print("Sum of all odd numbers: "+oddSum);
	}//sumEvenOdd

}//class