import java.util.Scanner;
public class ArraySumAverage{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows=input.nextInt();

		System.out.print("Enter number of columns: ");
		int cols=input.nextInt();

		int array[][]=new int[rows][cols];
		fillArray(array);
		printSumAverage(array);
	}//main

	static void fillArray(int[][] array){
		Scanner input = new Scanner(System.in);

		System.out.println("---Fill the array---");
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print("[" +i+ "]" + "[" +j+ "]: ");
				array[i][j]=input.nextInt();
			}//inner
		}//outer

	}//fillArray

	static void printSumAverage(int[][] array){
		System.out.println("---Sum and Average---");

		double sum=0,count=0;
		double average=0;

		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				sum+=array[i][j];
				count++;
			}//inner
		}//outer

		average=sum/count;
		System.out.println("\nSum:"+(int)sum);
		System.out.println("\nAverage:"+average);

	}//printSumAverage

}//class