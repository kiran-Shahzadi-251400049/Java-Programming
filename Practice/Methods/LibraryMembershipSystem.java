import java.util.Scanner;
public class LibraryMembershipSystem 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);  
		String name = "";
		int age = 0;
		boolean validName = false;
		boolean validAge = false;

		while (!validName) 
		{
			System.out.print("Enter your full name: ");
			name = input.nextLine();

			if (name.matches("[a-zA-Z ]+")) 
			{
				validName = true;
			}//if

			else 
			{
				System.out.println("Error: Name should contain only letters and spaces.");
			}//else
		}//while

		while (!validAge) 
		{
			System.out.print("Enter your age: ");

			age = input.nextInt();
			input.nextLine(); 

			if (age >= 12 && age <= 100) 
			{
				validAge = true;
			}//if

			else 
			{
				System.out.println("Error: Age must be between 12 and 100.");
			}//else
		}//while

		double price = assignMemberShip(name, age);
		userPayment(price, name, input);
		System.out.println("Thank You for Using This System.");
	}//main

	public static double assignMemberShip(String name, int age) 
	{
		System.out.println("\nWELCOME " + name.toUpperCase());

		double price = 0;
		String membershipType = "";

		if (age >= 12 && age <= 17) 
		{
			membershipType = "Child Membership";
			price = 1500;
		}//if
		else if (age >= 18 && age <= 59) 
		{
			membershipType = "Adult Membership";
			price = 3000;
		}//else if 
		else 
		{
			membershipType = "Senior Membership";
			price = 5000;
		}//else

		System.out.println("Membership Type: " + membershipType);
		System.out.println("Membership Fee: $" + price);

		return price;
	}//assignMemberShip

	public static void userPayment(double price, String name, Scanner input) 
	{

		System.out.print("Enter payment amount: ");
		double amount = input.nextDouble();

		if (amount >= price) 
		{
			System.out.println("\nMembership purchased successfully for " + name);
		}//if

		else 
		{
			System.out.println("\nYou have insufficient balance!\nMembership purchase failed!");
		}//else
	}//userPayment

}//class

