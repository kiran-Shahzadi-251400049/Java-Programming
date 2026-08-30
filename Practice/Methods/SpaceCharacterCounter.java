import java.util.Scanner;
public class SpaceCharacterCounter
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter s String: ");
		String str = input.nextLine();

		int result=countSpaceCharacter(str);
		System.out.print("Number of space characters is "+ result);

	}//main


	public static int countSpaceCharacter(String str)
	{
		int count=0;

		for (int i=0; i<str.length();  i++)
		{
			char ch=str.charAt(i);
			if(Character.isWhitespace(ch))
			{
				count++;
			}//if
		}//for
	
		return count;

	}//countSpaceCharacter

}//class