import java.util.Scanner;
public class SmallerThanNumber
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number for comparison: ");
		int number=input.nextInt();

		System.out.print("Enter the size of array: ");
		int size=input.nextInt();

		int [] array = new int[size];

		for(int i=0; i<array.length; i++)
		{
			System.out.print("Enter the element # "+ (i+1) +" of array: ");
			array[i]=input.nextInt();
		}//for

		smallerThanNumber(array, number);

	}//main

	public static void smallerThanNumber(int[] array, int number)
	{
		System.out.print("The elements of array smaller than "+number+" are: ");
		for(int i=0; i<array.length; i++)
		{
			if(number>array[i])
			{
				System.out.print(array[i]+" ");
			}//if
		}//for
	}//smallerThanNumber
}//class