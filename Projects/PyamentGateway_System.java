//Interface-Transactable

interface Transactable{
	//Abstract-Methods
	public abstract boolean authorize();
	public abstract double execute();

}//Interface-Transactable



//Interface-Auditable

interface Auditable{
	//Abstract-Method
	public abstract void logTransaction();

}//Interface-Auditable



//Abstract-Class-PaymentMethod

abstract class PaymentMethod implements Transactable, Auditable{
	//Data Members
	protected String transactionId;
	protected double amount;

	//Abstract-Methods
	public abstract boolean authorize();
	public abstract double execute();

	//Overidden-Method
	@Override
	public void logTransaction(){
		System.out.println("Transaction Id: "+transactionId +"\nAmount: "+amount);
	}

}//Abstract-Class-PaymentMethod



//Abstract-CardPayment

abstract class CardPayment extends PaymentMethod{
	//Data Member
	protected String cardNumber;

	//abstract-Method
	public abstract boolean validateCard();	

}//Abstract-CardPayment



//DigitalWalletPayment

class DigitalWalletPayment extends PaymentMethod{
	//Data Member
	private String walletId;

	//Constructor
	public DigitalWalletPayment(String transactionId, double amount, String walletId){
		this.transactionId=transactionId;
		this.amount=amount;
		this.walletId=walletId;
	}

	//Overridden-Methods
	@Override
	public boolean authorize(){
		if(walletId!=null && walletId.length()==16){
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public double execute(){
		if(authorize()){
			return amount;
		}
		else {
			return -1;
		}
	}
	
}//DigitalWalletPayment



//CreditCardPayment

class CreditCardPayment extends CardPayment{
	//Data Member
	private double cardLimit;

	//Constructor
	public CreditCardPayment(String transactionId, double amount, String cardNumber, double cardLimit){
		this.transactionId=transactionId;
		this.amount=amount;
		this.cardNumber=cardNumber;
		this.cardLimit=cardLimit;
	}

	//Overridden-Methods
	@Override
	public boolean validateCard(){
		if(cardNumber!=null && cardNumber.length()==16){
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean authorize(){
		if(validateCard() && amount<=cardLimit){
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public double execute(){
		if(authorize()){
			return amount;
		}
		else {
			return -1;
		}
	}

}//CreditCardPayment



//DebitCardPayment

class DebitCardPayment extends CardPayment{
	//Data Member
	private String linkedAccount;

	//Constructor
	public DebitCardPayment(String transactionId, double amount, String cardNumber, String linkedAccount){
		this.transactionId=transactionId;
		this.amount=amount;
		this.cardNumber=cardNumber;
		this.linkedAccount=linkedAccount;
	}

	//Overridden-Methods
	@Override
	public boolean validateCard(){
		if(cardNumber!=null && cardNumber.length()==16){
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean authorize(){
		if(validateCard() && linkedAccount!=null){
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public double execute(){
		if(authorize()){
			return amount;
		}
		else {
			return -1;
		}
	}
	
}//DebitCardPayment



//PyamentGateway_System

class PyamentGateway_System{
	
	public static void main(String[] args) {

		CreditCardPayment cp=new CreditCardPayment("ID-101", 12000, "1238732184528013", 25000);

		System.out.println("\nCredit card is valid: "+cp.validateCard());
		System.out.println("Transaction can be done through Credit card: "+cp.authorize());
		if(cp.execute()==-1){
			System.out.println("Transaction has failed!");
		}
		else {
			System.out.println("Transaction has done successfully:)\nTransaction Amount: "+cp.execute());
		}


		DebitCardPayment dcp=new DebitCardPayment("ID-102", 31000, "9826140471038146", "LA-701");

		System.out.println("\nDebit card is valid: "+dcp.validateCard());
		System.out.println("Transaction can be done through Debit card: "+dcp.authorize());
		if(dcp.execute()==-1){
			System.out.println("Transaction has failed!");
		}
		else {
			System.out.println("Transaction has done successfully:)\nTransaction Amount: "+dcp.execute());
		}


		DigitalWalletPayment dwp=new DigitalWalletPayment("ID-103", 5000, "WID-1287240372");
		System.out.println("\nTransaction can be done through Digital wallet: "+dwp.authorize());
		if(dwp.execute()==-1){
			System.out.println("Transaction has failed!");
		}
		else {
			System.out.println("Transaction has done successfully:)\nTransaction Amount: "+dwp.execute());
		}
	}

}//PyamentGateway_System
