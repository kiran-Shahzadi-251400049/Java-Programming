import java.util.Scanner;
public class NumberPyramidGenerator
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		int height=0;
		
		do 
		{
            			System.out.print("Enter the height of pyramid (>=2): ");
            			height = input.nextInt();

            			if (height < 2) 
			{
                				System.out.println("Error: Height must be at least 2.");
            			}//if

       		} while (height<2);
		
		for (int i = 1; i <= height; i++) 
		{

			for (int space = 1; space <= height - i; space++) 
			{
                				System.out.print("  ");
			}//for

			for (int j = 1; j <= i; j++) 
			{
				System.out.print(i + "   ");
			}//for

			System.out.println();
	
		}//outer for
	}//main
}//class
