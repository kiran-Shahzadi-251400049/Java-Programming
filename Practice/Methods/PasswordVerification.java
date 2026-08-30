import java.util.Scanner;
public class PasswordVerification
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("The password must be at least 8 characters long including uppercase, lowercase and digit.");
		System.out.print("Enter the password: ");
		String password = input.nextLine();
	
		verifyPassword(password);

	}//main


	public static void verifyPassword(String password)
	{
		int CapitalCount=0;
		int LowerCount=0;
		int DigitCount=0;

		for(int i=0; i<password.length(); i++)
		{
			char ch=password.charAt(i);

			if(Character.isLowerCase(ch))
			{
				LowerCount++;
			}//if

			
			else if(Character.isUpperCase(ch))
			{
				CapitalCount++;
			}//else if

			else if(Character.isDigit(ch))
			{
				DigitCount++;
			}//else if

		}//for

		if(CapitalCount<1 || LowerCount<1 || DigitCount<1)
		{
			System.out.print("The password you entered is invalid!");
		}//if


		else
		{
			System.out.print("The password you entered is valid :)");
		}//if

	}//verifyPassword

}//class