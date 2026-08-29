public class Wallet{
	//Data Members
	private String walletId;
	protected double balance;
	private String currency;
	private String status;

	//Constructor
	public Wallet(){
		walletId=null;
		balance=0;
		currency=null;
		status=null;
	}
	public Wallet(String walletId, double balance, String currency, String status){
		this.walletId=walletId;
		this.balance=balance;
		this.currency=currency;
		this.status=status;
	}

	//Setters
	public void setWalletId(String walletId){
		this.walletId=walletId;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void setCurrency(String currency){
		this.currency=currency;
	}
	public void setStatus(String status){
		this.status=status;
	}



	//Getters
	public String getWalletId(){
		return walletId;
	}
	public double getBalance(){
		return balance;
	}
	public String getCurrency(){
		return currency;
	}
	public String getStatus(){
		return status;
	}



	//Methods
    public boolean checkBalance(){
        return balance>0;
    }
    public void displayDetails() {
        System.out.println("Wallet ID: " +walletId +", Balance:" +balance +", Currency=" +currency +", Status=" +status);
    }

}//Wallet