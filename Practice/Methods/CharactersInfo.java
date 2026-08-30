import java.util.Scanner;
public class CharactersInfo
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		
		wordsInfo(word);
	}//main

	public static void wordsInfo(String word)
	{
		int num = word.length();
		System.out.println("Number of characters: "+num);

		int vowelCount=0;

		for(int index = 0; index<num; index++)
		{
			char c = word.charAt(index);
			
			if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u')
			{
				vowelCount++;
			}//if
		}//for

		System.out.print("Number of vowels: "+vowelCount);

	}//wordsInfo
}//class