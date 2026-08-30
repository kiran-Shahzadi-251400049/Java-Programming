/*
Print this pattern
A A A A
B B B B
C C C C
D D D D
*/

public class AlphabetPattern
{
	public static void main(String [] args)
	{
		char alphabet='A';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(alphabet);
			}
			System.out.println();
			alphabet++;
		}
	}
}