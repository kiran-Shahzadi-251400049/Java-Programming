import java.util.Scanner;
public class PalindromicPattern
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int n = input.nextInt();

		char c = 'A';
		for(int i=1; i<=n; i++)
		{
			for(int space = 1; space <= n - i; space++)
			{
				System.out.print("  ");
			}

			char temp = c;
			for (int j = 1; j <= i; j++)
			{
				System.out.print(temp + " ");
				temp++;
			}


			temp -= 2;
			for (int j = 1; j < i; j++)
			{
				System.out.print(temp + " ");	
				temp--;
			}

			System.out.println();
			c++;
		}//outer for
	}
}
