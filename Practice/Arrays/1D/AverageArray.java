import java.util.Scanner;
public class AverageArray
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int size=input.nextInt();

		int [] array = new int[size];

		for(int i=0; i<array.length; i++)
		{
			System.out.print("Enter the element # "+ (i+1) +" of array: ");
			array[i]=input.nextInt();
		}//for

		averageArray(array);

	}//main

	public static void averageArray(int[] array)
	{
		double sum=0;
		for(int i=0; i<array.length; i++)
		{
			sum+=array[i];
		}//for

		double average=sum/array.length;

		System.out.print("The average of array elements:"+average);

	}//smallerThanNumber
}//class