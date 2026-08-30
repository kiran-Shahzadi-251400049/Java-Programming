import java.util.Scanner;

public class AlphabetLetterChecker 
{
    public static void main(String[] args) 
	{

       	 Scanner input = new Scanner(System.in);

        	System.out.print("Enter a character: ");
        	String userInput = input.next();  
        	char ch = userInput.charAt(0);    

        	if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
	{
            		System.out.println(ch + " is an alphabet letter.");
        	} 
	else 
	{
            		System.out.println(ch + " is NOT an alphabet letter.");
        	}

    }

}
