import java.util.Scanner;
public class monthlyBillCalculator
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter units consumed: ");
		int units = input.nextInt();

		while(units<0)
		{
		System.out.print("Invalid Input!\nEnter units consumed again: ");
		units = input.nextInt();
		}//while

		input.nextLine();
		System.out.print("Enter your constumer type (Domestic or Industrial ): ");
		String customerType = input.nextLine();
	
		while(!customerType.equalsIgnoreCase("Domestic") && !customerType.equalsIgnoreCase("Industrial"))
		{
			System.out.print("Invalid input!\nEnter your constumer type again: ");
			customerType = input.nextLine();
		}//while

		double total = 0;		

		if(units<100)
		{
			total = units*5;
			

			if(customerType.equalsIgnoreCase("Industrial"))
			{
				total = total + (0.15*total);
			}//if
		}//if

		else if(units>=100 && units<=200)
		{
			total = units*7;

			if(customerType.equalsIgnoreCase("Industrial"))
			{
				total = total + (0.15*total);
			}//if
		}//else if

		else 
		{
			total = units*10;

			if(customerType.equalsIgnoreCase("Industrial"))
			{
				total = total + (0.15*total);
			}//if
		}//else 

		System.out.print("Final Electricity Bill: Rs."+total);
	}//main
}//class