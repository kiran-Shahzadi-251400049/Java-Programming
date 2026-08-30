import java.util.Scanner;
public class ConcatenationAndLowerCase
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String str1 = input.nextLine();

		System.out.print("Enter second string: ");
		String str2 = input.nextLine();

		concatenateAndDisplay(str1, str2);

	}//main


	public static void concatenateAndDisplay(String str1, String str2)
	{
		
		String str3=str1.concat(str2);
		String result=str3.toLowerCase();

		System.out.print("Resultant String is "+result);
	}//concatenateAndDisplay

}//class