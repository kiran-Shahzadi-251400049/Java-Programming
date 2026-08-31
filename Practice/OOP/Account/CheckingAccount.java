public class CheckingAccount extends BankAccount{
	
	//Data members
	private double insufficientFundsFee;


	//Constructors
	public CheckingAccount(){
		insufficientFundsFee=0;
	}//Default 0-argument

	public CheckingAccount(double insufficientFundsFee){
		this.insufficientFundsFee=insufficientFundsFee;
	}//Overloaded 1-argument

	public CheckingAccount(int accountNumber, String accountOwner, double accountBalance, double insufficientFundsFee){
		super(accountNumber, accountOwner, accountBalance);
		this.insufficientFundsFee=insufficientFundsFee;
	}//Overloaded 4-arguments



	//Setter-Modifier
	public void setInsufficientFundFee(double insufficientFundsFee){
		this.insufficientFundsFee=insufficientFundsFee;
	}//setInsufficientFundFee



	//Getter-Accessor
	public double getInsufficientFundFee(){
		return insufficientFundsFee;
	}//getInsufficientFundFee



	//Other methods
	public void withdrawal(double amount){
    	if(this.getAccountBalance()>=amount){
        	setAccountBalance(this.getAccountBalance()-amount);
    	}
    	else{
        	setAccountBalance(this.getAccountBalance()-amount-insufficientFundsFee);
        	System.out.println("Insufficient funds!!! \nFee charged: "+ insufficientFundsFee);
    	}
    	System.out.println("Updated balance: " + this.getAccountBalance());
	}//withdrawal

	public void accountStatement(){
		super.accountStatement();
		System.out.println("Insufficient funds fee: "+insufficientFundsFee);
	}//accountStatement


	
}//CheckingAccount-class/child2