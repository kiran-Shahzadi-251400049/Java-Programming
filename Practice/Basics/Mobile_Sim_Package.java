import java.util.Scanner;
public class Mobile_Sim_Package
{//class

	public static void main(String [] args)
	{//main
		Scanner simPackages = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("\b Welcome to sim Selector \b ");
		System.out.println("================================");

		System.out.println("1: Jazz \n2: Zong \n3: Ufone \n4: Telenor ");
		System.out.print("Enter your sim choice (1-4): ");
		int simChoice = simPackages.nextInt();

		double pkgCost=0.0;
		double tax15=0.0;
		double totalCost=0.0;
		double remainingCost=0.0;



		if(simChoice<1 || simChoice>4)
		{
			System.out.println("\n Error: Invalid sim choice!");
			return; //to terminate program
		}



		if(simChoice==1)
		{
			System.out.println("\nAvailable packages:\nPackage 1: 2GB data + 100 minutes for $5 \nPackage 2: 5GB data + 500 minutes for $10");
		}
		else if(simChoice==2)
		{
			System.out.println("\nAvailable packages:\nPackage 1: 3GB data + 50 minutes for $6  \nPackage 2: 10GB data + 300 minutes for $12");
		}
		else if(simChoice==3)
		{
			System.out.println("\nAvailable packages:\nPackage 1: 1GB data + 200 minutes for $4  \nPackage 2: 4GB data + 400 minutes for $8");
		}
		else 
		{
			System.out.println("\nAvailable packages:\nPackage 1: 2GB data + 150 minutes for $5  \nPackage 2: 6GB data + 600 minutes for $11");
		}

		


		System.out.print("\nEnter your package choice(1-2): ");
		int pkgChoice = simPackages.nextInt();

		if(pkgChoice<1 || pkgChoice>2)
		{
			System.out.println("\n Error: Invalid package choice!");
			return;  //to terminate program
		}



		System.out.print("\nEnter your current balance: $");
		double currentBalance = simPackages.nextDouble();

		System.out.println("================================");
		System.out.println("\b Transaction Details \b ");
		System.out.println("================================");





		if(currentBalance<totalCost)
		{
			System.out.println("Please recharge your account!");
		}

		if(simChoice==1)
		{
			System.out.println("Sim selected: Jazz");

			if(pkgChoice==1)
			{
				pkgCost=5;
			}
			else
			{
				pkgCost=10;
			}
			System.out.println("Package Price: $"+pkgCost);
		}
		else if(simChoice==2)
		{
			System.out.println("Sim selected: Zong");

			if(pkgChoice==1)
			{
				pkgCost=6;
			}
			else
			{
				pkgCost=12;
			}
			System.out.println("Package Price: $"+pkgCost);
		}
		else if(simChoice==3)
		{
			System.out.println("Sim selected: Ufone");

			if(pkgChoice==1)
			{
				pkgCost=4;
			}
			else
			{
				pkgCost=18;
			}
			System.out.println("Package Price: $"+pkgCost);
		}
		else 
		{
			System.out.println("Sim selected: Telenor");

			if(pkgChoice==1)
			{
				pkgCost=5;
			}
			else
			{
				pkgCost=11;
			}
			System.out.println("Package Price: $"+pkgCost);
		}

		tax15=0.15*pkgCost;
		System.out.println("Tax: $"+tax15);

		totalCost=pkgCost+tax15;
		System.out.println("Total Cost: $"+totalCost);

		remainingCost=currentBalance-totalCost;
		System.out.println("Remaining Balance: $"+remainingCost+"\n");

		System.out.println("Thank you for using our service!");
	}//main
}//class