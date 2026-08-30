import java.util.Scanner;
public class BankAccount 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		double[] balance = {0};

		System.out.print("Enter amount to deposit: ");
		double depAmount = input.nextDouble();
		deposit(balance, depAmount); 

		System.out.print("Enter amount to withdraw: ");
		double withAmount = input.nextDouble();
		withdraw(balance, withAmount);

		displayBalance(balance); 

	}//main

	public static void deposit(double[] balance, double depAmount)
	{
		balance[0] += depAmount;
		System.out.println("Amount Deposited: " + depAmount);
		System.out.println("Updated Balance: " + balance[0]);
		System.out.println();
	}//deposit

	public static void withdraw(double[] balance, double withAmount) 
	{
		if (withAmount <= balance[0]) 
		{
			balance[0] -= withAmount;
			System.out.println("Amount Withdrawn: " + withAmount);
			System.out.println("Updated Balance: " + balance[0]);
		}//if
		else 
		{
			System.out.println("Insufficient balance! Withdrawal not allowed.");
		}//else

		System.out.println();
	}//withdraw

	public static void displayBalance(double[] balance) 
	{
		System.out.println("Current Account Balance: " + balance[0]);
	}//displayBalance
}//class


