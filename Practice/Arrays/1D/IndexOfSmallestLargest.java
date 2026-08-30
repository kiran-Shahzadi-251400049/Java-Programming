import java.util.Scanner;
public class IndexOfSmallestLargest
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int size=input.nextInt();

		int [] array = new int[size];

		for(int i=0; i<array.length; i++)
		{
			System.out.print("Enter the element # "+ (i+1)+" of array: ");
			array[i]=input.nextInt();
		}//for

		System.out.print("Enter L to get the index of largest value and S to get the smallest value in the array:");
		char typeOfValue=input.next().charAt(0);

		int result=getSLIndex(array, typeOfValue);

		if(Character.toUpperCase(typeOfValue)=='S')
		{
			System.out.print("The index of smallest element is "+result);
		}

		else if(Character.toUpperCase(typeOfValue)=='L')
		{
			System.out.print("The index of largest element is "+result);
		}

		else
		{
			System.out.print("Invalid Input!");
		}

	}//main

	public static int getSLIndex(int[] array, char typeOfValue)
	{	
		Character.toUpperCase(typeOfValue);

		if(Character.toUpperCase(typeOfValue)=='S')
		{
			int MinIndex=0;
			for(int i=0; i<array.length; i++)
			{
				if(array[i]<array[MinIndex])
				MinIndex=i;

			}//for
			return MinIndex;
		
		}//if

		else if(Character.toUpperCase(typeOfValue)=='L')
		{
			int MaxIndex=0;
			for(int i=0; i<array.length; i++)
			{
				if(array[i]>array[MaxIndex])
				MaxIndex=i;
			}//for
			return MaxIndex;
		}//else if

		else
		{
			return -1;
		}//else

	}//getSLIndex
}//class