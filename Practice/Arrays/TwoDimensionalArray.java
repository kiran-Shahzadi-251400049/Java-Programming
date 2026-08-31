import java.util.Scanner;

public class TwoDimensionalArray{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter number of Rows: ");
		int row = s.nextInt();
		System.err.print("Enter number of Cols: ");
		int col = s.nextInt();

		int[][] a = new int[row][col];

		System.out.println("\nArray adress: "+a);
		System.out.println("\nArray length: "+a.length);	//size

		System.out.println("\nFill the array: ");
		fillArray(a, s);
		System.out.println("\nPrinting array: ");
		printArray(a);
		}//main

		public static void fillArray(int [][] a, Scanner s){
			for(int rows = 0; rows<a.length; rows++){
				for(int cols = 0; cols<a[rows].length; cols++){
					System.out.print("["+rows+"]"+"["+cols+"]: ");
					a[rows][cols] = s.nextInt();
				}
			}
		}//fillArray

		public static void printArray(int [][] a){
			for(int r = 0; r<a.length;r++){
				for(int c = 0; c<a[r].length; c++){
					System.out.print(a[r][c]+" ");
				}
			}
		}//printArray

}//class