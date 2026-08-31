import java.util.Scanner;
public class ArrayMatricesAddition{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int array1[][]={{5,7,9,4,3}, {2,3,9,7,6}, {3,6,8,7,9}, {1,9,7,5,6}, {3,8,7,9,2}};
		
		int array2[][]={{7,3,2,1,5}, {3,9,4,0,3}, {6,2,8,9,4}, {5,0,3,8,7}, {1,6,8,4,3}};

		System.out.println("Before addition: ");
		printArray(array1);
		System.out.println("\n");
		printArray(array2);

		int result [][] = addMatrices(array1, array2);
		System.out.println("After addition: ");
		printArray(result);
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

	static int[][] addMatrices(int[][] array1, int[][] array2){
		int [][]array=new int[array1.length][array1[0].length];
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				array[i][j]=array1[i][j]+array2[i][j];

			}//inner
		}//outer
		return array;
	}//addMatrices

}//class