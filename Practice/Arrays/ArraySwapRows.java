import java.util.Scanner;
public class ArraySwapRows{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int rows,cols;

		do{
			System.out.print("Enter number of rows: ");
			rows=input.nextInt();
		}while(rows<=0);

		do{
			System.out.print("Enter number of columns: ");
			cols=input.nextInt();
		}while(cols<=0);

		int array[][]=new int[rows][cols];
		
		System.out.println("---Fill the array---");
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print("[" +i+ "]" + "[" +j+ "]: ");
				array[i][j]=input.nextInt();
			}//inner
		}//outer


		System.out.println("Before swapping: ");
		printArray(array);
		swapFirstAndLastRow(array);
		System.out.println("After swapping: ");
		printArray(array);
	}//main

	static void printArray(int[][] array){
		Scanner input = new Scanner(System.in);

		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print(array[i][j]+" ");
			}//inner
			System.out.println();
		}//outer

	}//printArray

	static void swapFirstAndLastRow(int[][] array){
		
		int temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				if(i==0 || i==array.length-1)
				{
					temp=array[i][j];
					array[i][j]=array[array.length-1][j];
					array[array.length-1][j]=temp;
				}
			}//inner
		}//outer
	}//swapFirstAndLastRow

}//class