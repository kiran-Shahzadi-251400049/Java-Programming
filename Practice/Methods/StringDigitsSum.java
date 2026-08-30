import java.util.Scanner;
public class StringDigitsSum
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);


		System.out.print("Enter a series of single digit numbers with nothing separating them: ");
		String str = input.nextLine();

	
		int result=sumStringDigits(str);
		System.out.print("Sum of digits of String: "+result);

	}//main


	public static int sumStringDigits(String str)
	{
		int sum=0;

		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			int digit=Character.getNumericValue(ch);
			sum+=digit;

		}//for

		return sum;

	}//sumStringDigits

}//class