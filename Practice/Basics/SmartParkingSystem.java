import java.util.Scanner;
public class  SmartParkingSystem
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your Vehicle type( Car, Bike, or Truck ): ");
		String type = input.nextLine();

		while(!type.equalsIgnoreCase("Car") && !type.equalsIgnoreCase("Bike") && !type.equalsIgnoreCase("Truck"))
		{
			System.out.print("Invalid input!\nEnter your Vehicle type again ( Car, Bike, or Truck ): ");
			type = input.nextLine();
		}//while

		System.out.print("Enter your Parking Duration (in hours): ");
		int duration = input.nextInt();

		input.nextLine();
		System.out.print("Enter your Membership Status (Yes / No): ");
		String membershipStatus = input.nextLine();

		while(!membershipStatus.equalsIgnoreCase("Yes") && !membershipStatus.equalsIgnoreCase("No"))
		{
			System.out.print("Invalid input!\nEnter your Membership Status again (Yes / No): ");
			membershipStatus = input.nextLine();
		}//while
		
		System.out.print("Enter your Time of Entry (24-hour format) : ");
		int entryTime = input.nextInt();

		while(entryTime<0 || entryTime>=24)	//error >24 not >=24
		{
			System.out.print("Invalid input!\nEnter your Time of Entry again (24-hour format): ");
			entryTime = input.nextInt();
		}//while


		double total = 0;

		if (type.equalsIgnoreCase("Car"))	
		{
			total = 50* duration;

			if (entryTime >= 18 && entryTime <= 23)    
			{
				total = total+(0.30*total);	
			}

			if (duration > 5)                   
			{
				total = total-(0.10*total);
			}

			if (membershipStatus.equalsIgnoreCase("Yes")) 
			{
				total = total-(0.20*total);
			}

		}//outer if

		else if (type.equalsIgnoreCase("Bike"))
		{

				total = 20*duration;

				if (entryTime >= 18 && entryTime <= 23)
				{
					total = total+(0.30*total);
				}

				if (duration > 5)
				{
					total = total-(0.10*total);
				}

				if (membershipStatus.equalsIgnoreCase("Yes"))
				{
					total = total-(0.20*total);
				}
		}//else if 

		else 
		{

					total = 80*duration;

					if (entryTime >= 18 &&entryTime <= 23)
					{
						total = total+(0.30*total);
					}

					if (duration > 5)
					{
						total = total-(0.10*total);
					}

					if (membershipStatus.equalsIgnoreCase("Yes"))
					{
						 total = total-(0.20*total);
					}				
		}// else 


        		System.out.println("Final Parking Fee = Rs. " + total);

	}//main
}//class