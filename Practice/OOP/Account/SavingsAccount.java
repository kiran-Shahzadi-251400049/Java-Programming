public class SavingsAccount extends BankAccount{
	
	//Data members
	private double annualInterestRate;


	//Constructors
	public SavingsAccount(){
		annualInterestRate=0;
	}//Default 0-argument

	public SavingsAccount(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}//Overloaded 1-argument

	public SavingsAccount(int accountNumber, String accountOwner, double accountBalance, double annualInterestRate){
		super(accountNumber, accountOwner, accountBalance);
		this.annualInterestRate=annualInterestRate;
	}//Overloaded 4-arguments



	//Setter-Modifier
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}//setAnnualInterestRate



	//Getter-Accessor
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}//getAnnualInterestRate



	//Other methods
	public void withdrawal(double amount){
		if(this.getAccountBalance()>=amount){
			this.setAccountBalance(this.getAccountBalance()-amount);
		}
		else{
			System.out.println("Insufficient account balance!");
		}

	}//withdrawal 

	public void depositMonthlyInterest(){
		double monthlyInterestRate=annualInterestRate/12;
		double interestAmount=this.getAccountBalance()*monthlyInterestRate;
		this.setAccountBalance(this.getAccountBalance()+interestAmount);
	}//depositMonthlyInterest

	public void accountStatement(){
		super.accountStatement();
		System.out.println("Annual interest rate: "+annualInterestRate);
	}//accountStatement
		
		

	
}//SavingsAccount-class/child1