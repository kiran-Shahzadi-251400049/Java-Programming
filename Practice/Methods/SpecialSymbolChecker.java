import java.util.Scanner;
public class SpecialSymbolChecker
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		String entry =" ";
		char alphabet =' ';
		int length = 0;

		do{
			System.out.print("Enter single chracter: ");
			entry = input.nextLine();		
			length = entry.length();
			alphabet =entry.charAt(0);

		}while(length!=1);


		boolean result= isSpecialSymbol(alphabet);

		if(result==false)
		{
			System.out.print("It is not a special symbol.");
		}//if

		else
		{
			System.out.print("It is a special symbol.");
		}//else

	}//main

	public static boolean isSpecialSymbol(char alphabet)
	{
		

		if(alphabet=='@' || alphabet=='#' || alphabet=='$' ||alphabet=='%' || alphabet=='~')
		{
			return true;
		}//if

		else
		{
			return false;
		}//else

	}//isSpecialSymbol
}