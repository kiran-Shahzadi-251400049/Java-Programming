import java.util.Scanner;
public class IndexFinder
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter source: ");
		String source = input.nextLine();

		System.out.print("Enter target: ");
		String target = input.nextLine();

		int result=searchString(source, target);

		if(result==-1)
		{
			System.out.print("Target not found!");
		}//if

		else
		{
			System.out.print("Found target at "+ result+ " index");
		}//else

	}//main


	public static int searchString(String source, String target)
	{
		return source.indexOf(target);

	}//searchString

}//class