public class UsingAccounts{
	
	public static void main(String[] args) {
		SavingsAccount account1=new SavingsAccount(12345, "Hamiz Ali", 25500, 10);
		CheckingAccount account2=new CheckingAccount(567890, "Sahil", 20000, 50);

		System.out.println("\nInformation of Account # 1:");
		account1.accountStatement();

		System.out.println("\n\nInformation of Account # 2:");
		account2.accountStatement();


		System.out.println("\n\nDepositing 2000 in Account # 1...");
		account1.deposit(2000);
		account1.accountStatement();


		System.out.println("\n\nDepositing 5000 in Account # 1...");
		account1.deposit(5000);
		account1.accountStatement();



		System.out.println("\n\nWithdarawal 15000 from Account # 1...");
		account1.withdrawal(15000);
		account1.accountStatement();


		System.out.println("\n\nWithdarawal 21000 from Account # 2...");
		account2.withdrawal(21000);


		System.out.println("\n\nDepositing 3000 in Account # 2...");
		account2.deposit(3000);
		account2.accountStatement();

		System.out.println("\n\nDepositing monthly interest in Account # 1...");
		account1.depositMonthlyInterest();
		account1.accountStatement();


		System.out.println("\n\nDepositing monthly interest again in Account # 1...");
		account1.depositMonthlyInterest();
		account1.accountStatement();

	}//main

}//UsingAccounts