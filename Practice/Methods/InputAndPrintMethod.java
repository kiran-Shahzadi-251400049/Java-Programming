import java.util.Scanner;
public class InputAndPrintMethod
{
	public static void main(String [] args)
	{
		 getInput();
	}//main

	public static void getInput()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		while(age<10 || age>=70)
		{
			System.out.println("Invalid age! Try again.");
			System.out.print("Enter your age: ");
			age = input.nextInt();	
		}//while

		printInput(name, age);
	}//getInput

	public static void printInput(String name, int age)
	{
		System.out.println("====================");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.print("====================");
	}//printInput
}//class