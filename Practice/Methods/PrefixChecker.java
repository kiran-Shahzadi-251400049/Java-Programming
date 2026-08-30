import java.util.Scanner;
public class PrefixChecker
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = input.nextLine();

		System.out.print("Enter a prefix: ");
		String prefix = input.nextLine();

		int result=checkPrefix(str, prefix);

		if(result==0)
		{
			System.out.print("Yes! The string starts with "+prefix);
		}//if

		else
		{
			System.out.print("No! The string doesn't start with "+prefix);
		}//else

	}//main


	public static int checkPrefix(String str, String prefix)

	{
		
			if(str.startsWith(prefix))
			{
				return 0;
			}//if
		
			else
			{
				return -1;
			}//else

	}//countDigits

}//class