/*
Print this pattern
1
22
333
4444
55555
*/

public class DigitPattern
{
	public static void main(String [] args)
	{
		int num=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(num);
			}
			System.out.println();
			num++;
		}
	}
}