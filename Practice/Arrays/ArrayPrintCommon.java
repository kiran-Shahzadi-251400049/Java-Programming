import java.util.Scanner;
public class   ArrayPrintCommon
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int [] arr1 = new int[5];
		System.out.println("Enter the elements of 1st array:");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print("Element # "+ (i+1)+": ");
			arr1[i]=input.nextInt();
		}//for

		int [] arr2 = new int[5];
		System.out.println("Enter the elements of 2nd array:");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print("Element # "+ (i+1)+": ");
			arr2[i]=input.nextInt();
		}//for
		printCommon(arr1, arr2);
	}//main

	public static void printCommon(int[] arr1, int[] arr2)

	{
		System.out.print("Common elements are: ");
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
				}
			}

		}

	}//printCommon

}//class