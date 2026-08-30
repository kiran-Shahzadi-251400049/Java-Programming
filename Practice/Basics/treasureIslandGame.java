import java.util.Scanner;
import java.util.Random;

public class treasureIslandGame
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
	
		int round=1;
		char choice;
		do
		{
			int num = rand.nextInt(200) + 1;
			if(round==1)
			{
				System.out.println("\n\nWelcome to Treasure Island!");
			}
			else
			{
				System.out.println("\n\nStarting a new round... ");
			}

			System.out.println("I have hidden a treasure somewhere between 1 and 200. \nYou have 8 attempts to find it.\n");

			int attempts = 1;
			int guessNum;


			System.out.print("(Attempt " + attempts + ") Enter your guess (1-200): ");
			guessNum = input.nextInt();

			while (guessNum < 1 || guessNum > 200)
			{
				System.out.print("Invalid Input!\nGuess the number again (1-200): ");
				guessNum = input.nextInt();
			}

			do
			{
				if (guessNum < num)
				{
					System.out.println("Hint: The treasure is farther north\n");
				}
				else if (guessNum > num)
				{
					System.out.println("Hint: The treasure is farther south.\n");
				}
				else 
				{
					System.out.println("Congratulations! You found the treasure at location " + num + "!");

					attempts = 9;
				}

				attempts++;
			
				 if (attempts <= 8)
				{
					System.out.print("(Attempt " + attempts + ") Enter your guess (1-200): ");
					guessNum = input.nextInt();

					while (guessNum < 1 || guessNum > 200)	
					{	
						System.out.print("Invalid Input!\nGuess the number again (1-200): ");	
						guessNum = input.nextInt();	
					}//while
	
				}//if

			} while (guessNum != num && attempts <= 8);	//inner do while

			if (guessNum != num && attempts > 8)	
			{	
				System.out.println("The treasure location is: " + num);	
			}
	
			System.out.print("Do you want to explore again? (Y/N): ");	
			choice = input.next().charAt(0);
	
			if (choice != 'Y' && choice != 'y') 
			{
				System.out.println("Thank you for playing Treasure Island! Goodbye!");
			}
			else
			{
				 round++;
			}

		} while (choice == 'Y' || choice == 'y');		//outer do while
	}//main
}//class

