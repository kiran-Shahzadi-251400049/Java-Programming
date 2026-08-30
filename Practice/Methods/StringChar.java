import java.util.Scanner;
public class StringChar
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String word = input.nextLine();
		
		System.out.print("Enter an ineger: ");
		int position = input.nextInt();

		while(position<=0 || position>word.length())
		{
			System.out.print("Enter a valid integer: ");
			position = input.nextInt();
		}//while	

		charPositions(word, position);	
	}//main

	public static void charPositions(String word, int position)
	{
		int length = word.length();
		int index=0;
		char firstCharacter = word.charAt(index);
		char lastCharacter = word.charAt(length-1);
		char positionCharacter = word.charAt(position-1);
		if(positionCharacter==' ')
		{
			positionCharacter = word.charAt(position);
		}//if

		System.out.println("First Character: "+firstCharacter);
		System.out.println("Last Character: "+lastCharacter);
		System.out.println("Character at position "+position+": "+positionCharacter);
	}//charPositions
}//class