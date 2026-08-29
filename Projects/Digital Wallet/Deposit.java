public class Deposit extends Transaction {
    //Data Member
    private int referenceNumber;
    private User user;

    //Constructors
    public Deposit(){
        referenceNumber=0;
        transactionId=0;
        timeStamp=null;
        amount=0;
        user=new User();
    }

    public Deposit(int referenceNumber, int transactionId, String timeStamp, double amount, User user){
        this.referenceNumber=referenceNumber;
        this.transactionId=transactionId;
        this.timeStamp=timeStamp;
        this.amount=amount;
        this.user=user;
    }


    //Setters
    public void setReferenceNumber(int referenceNumber){
        this.referenceNumber=referenceNumber;
    }
    public void setTransactionId(int transactionId){
        this.transactionId=transactionId;
    }
    public void setTimeStamp(String timeStamp){
        this.timeStamp=timeStamp;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public void setUser(User user){
        this.user=user;
    }



    //Getters
    public int getReferenceNumber(){
        return referenceNumber;
    }
   public int getTransactionId(){
        return transactionId;
    }
   public String getTimeStamp(){
        return timeStamp;
    }
   public double getAmount(){
        return amount;
    }
    public User getUser(){
        return user;
    }


    //Methods
    public void deposit(double amount, int referenceNumber) {
        user.wallet.setBalance(user.wallet.getBalance()+amount);
        System.out.println("\nDepositing "+amount +" your wallet...");
    }

    public String getDetails() {
        return "Reference Number: " +referenceNumber +"\nTransaction Id: "+transactionId +"\nTimeStamp: "+timeStamp +"\nDeposited Amount: "+amount +"\nBalnce in your wallet: "+user.wallet.getBalance() ;
    }
}