public class BankAccount{
	
	//Data members
	private int accountNumber;
	private String accountOwner;
	private double accountBalance;


	//Constructors
	public BankAccount(){
		accountNumber=0;
		accountOwner=null;
		accountBalance=0;
	}//Default 0-argument

	public BankAccount(int accountNumber, String accountOwner, double accountBalance){
		this.accountNumber=accountNumber;
		this.accountOwner=accountOwner;
		this.accountBalance=accountBalance;
	}//Overloaded 3-arguments


	//Setters-Modifiers
	public void setAccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}//setAccountNumber

	public void setAccountOwner(String accountOwner){
		this.accountOwner=accountOwner;
	}//setAccountOwner

	public void setAccountBalance(double accountBalance){
		this.accountBalance=accountBalance;
	}//setAccountBalance


	//Getters-Accessor
	public int getAccountNumber(){
		return accountNumber;
	}//getAccountNumber

	public String getAccountOwner(){
		return accountOwner;
	}//getAccountOwner

	public double getAccountBalance(){
		return accountBalance;
	}//getAccountBalance


	//Other methods
	public void accountStatement(){
		System.out.println("Account number: "+accountNumber +", Owner: "+accountOwner +", Balance: "+accountBalance);
	}//accountStatement

	public void deposit(double ammount){
		accountBalance+=ammount;
	}//deposit

	public void withdrawal(double ammount){
		accountBalance-=ammount;
	}//withdrawal


}//BankAccount/Parent-class