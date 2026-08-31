import java.util.Scanner;
public class  ArrayReplaceNegatives{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows=input.nextInt();

		System.out.print("Enter number of columns: ");
		int cols=input.nextInt();

		int array[][]=new int[rows][cols];

		System.out.println("------------Fill the array----------");
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print("[" +i+ "]" + "[" +j+ "]: ");
				array[i][j]=input.nextInt();
			}//inner
		}//outer

		System.out.println("-----Printing the original array -----");
		printArray (array);
		replaceNegativeWithZeroes(array);
		System.out.println("---Printing the non-negative array---");
		printArray (array);
	}//main

	static void replaceNegativeWithZeroes(int[][] array){
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				if(array[i][j]<0)
				{
					array[i][j]=0;
				}//if
			}//inner loop
		}//outer loop

	}//replaceNegativeWithZeroes

	static void printArray (int[][] array){
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print(array[i][j]+" ");
			}//inner
			System.out.println();
		}//outer

	}//printArray

}//class