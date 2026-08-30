/* Print numbers in rows
1 2 3
1 2 3
1 2 3
*/

public class NumbersRow
{

	public static void main(String [] args)
	{

		for(int i=1; i<=3; i++)
		{
			for(int j=1,num=1;j<=3;j++,num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}
}