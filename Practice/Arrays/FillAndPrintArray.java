import java.util.Scanner;
public class FillAndPrintArray
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		int [] array = new int[5];

		for(int i=0; i<array.length; i++)
		{
			System.out.print("Enter the score of team # "+ (i+1) +": ");
			array[i]=input.nextInt();
		}//for

		System.out.println();

		for(int k=0; k<array.length; k++)
		{
			System.out.print(array[k]+" ");
		}//for
	}//main
}//class