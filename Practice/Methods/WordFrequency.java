import java.util.Scanner;
public class WordFrequency 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter a paragraph:");
		String text = input.nextLine();

		text = text.toLowerCase();

		String cleanText = "";
		for (int i = 0; i < text.length(); i++) 
		{
			char ch = text.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || ch == ' ') 
			{
				cleanText += ch;
			}//if
		}//for

		String[] words = new String[50];
		int[] freq = new int[50];
		int count = 0;

		String word = "";

		for (int i = 0; i <= cleanText.length(); i++) 
		{
			char ch;

			if (i < cleanText.length())
			{
				ch = cleanText.charAt(i);
			}//if
			else
			{
				ch = ' ';
			}//else

			if (ch != ' ') 
			{
				word += ch;
			}//if 

			else 
			{
				if (!word.equals("")) 
				{
					boolean found = false;

					for (int j = 0; j < count; j++) 
					{
						if (words[j].equals(word)) 
						{
							freq[j] = freq[j] + 1;
							found = true;
						}//if
					}//for

					if (found == false) 
					{
						words[count] = word;
						freq[count] = 1;
						count++;
					}//if

					word = "";
				}//if
			}//else
		}//for

		System.out.println("Word Frequency:");
		for (int i = 0; i < count; i++) 
		{
			System.out.println(words[i] + " - " + freq[i]);
		}//for

	}//main
}//class

