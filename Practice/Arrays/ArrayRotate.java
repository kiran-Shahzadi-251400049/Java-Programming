import java.util.Scanner;
public class ArrayRotate{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Only square mattrix is allowed!");
		System.out.print("Enter the size(rows) of array: ");
		int rows = input.nextInt();
		System.out.print("Enter the columns of array: ");
		int cols = input.nextInt();

		int array [][]=new int [rows][cols];

		fillArray(array, input);

		printArray(array);

		rotateArray(array);


		
	}//main

	public static void fillArray(int [][] array, Scanner input){
		System.out.println("-----------Filling the array--------");
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print("[" +i+ "]" + "[" +j+ "]: ");
				array[i][j]=input.nextInt();
			}//inner
		}//outer
	}//fillArray

	static void printArray (int[][] array){
		System.out.println("----------Printing the array--------");
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print(array[i][j]+" ");
			}//inner
			System.out.println();
		}//outer
	}//printArray

	public static void rotateArray(int[][] array){
		System.out.println("----------Rotating the array--------");
		for(int i=0; i<array.length; i++){
			for(int j=array[i].length-1; j>=0; j--){
				System.out.print(array[j][i]+" ");
			}
		System.out.println();
		}//for
	}//rotateArray

}//class