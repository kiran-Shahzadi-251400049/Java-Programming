import java.util.Scanner;
public class SecondOccurenceIndex
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

		System.out.print("Enter the value to check: ");
		int value=input.nextInt();

		int result=getSecondIndex(array, value);

		if(result==-1)
		{
			System.out.print(value+" doesn't occures more than once");
		}//if

		else if(result==0)
		{
			System.out.print(value+" doesn't exists in array.");
		}//else if

		else
		{
			System.out.print("Second occurence of " +value +" is at index # "+ result);
		}//else


	}//main

	public static int getSecondIndex(int[] array, int value)
	{
		int occurenceCount=0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]==value)
			{
				occurenceCount++;
				if(occurenceCount>1)
				{
					return i;
				}//inner if
			}//if
		}//for

		if(occurenceCount==1)
		{
			return -1;
		}//if


		else
		{
			return 0;
		}//else

	}//smallerThanNumber
}//class