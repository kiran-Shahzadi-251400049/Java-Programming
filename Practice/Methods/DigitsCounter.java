import java.util.Scanner;
public class DigitsCounter
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter s String: ");
		String str = input.nextLine();

		int result=countDigits(str);
		System.out.print("Number of numeric digits is "+ result);

	}//main


	public static int countDigits(String str)
	{
		int count=0;

		for (int i=0; i<str.length();  i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}//if
		}//for
	
		return count;

	}//countDigits

}//class