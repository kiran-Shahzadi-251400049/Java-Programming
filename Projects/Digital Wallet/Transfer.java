public class Transfer extends Transaction {
    //Data Member
    private User user;
    private User user2;


    //Constructors
    public Transfer(){
        transactionId=0;
        timeStamp=null;
        amount=0;
        user=new User();
        user2=new User();
    }
    public Transfer(int transactionId, String timeStamp, double amount, User user, User user2){
        this.transactionId=transactionId;
        this.timeStamp=timeStamp;
        this.amount=amount;
        this.user=user;
        this.user2=user2;
    }


    //Setters
    public void setUser(User user){
        this.user=user;
    }
    public void setUser2(User user2){
        this.user2=user2;
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


    //Getters
    public User getUser(){
        return user;
    }
    public User getUser2(){
        return user2;
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


    //Methods
    public void transfer(double amount) {
        if(user.wallet.getBalance()>=amount){
            user.wallet.setBalance(user.wallet.getBalance()-amount);
            user2.wallet.setBalance(user2.wallet.getBalance()+amount);
            System.out.println("\nTransfering "+amount +" into Receiver's wallet");
            System.out.println("\nTransfer successful!");
        }
        else {
            System.out.println("\nInsufficient balance");
        }
    }
  
    public String getDetails(){
        return "\nTransaction Id: "+transactionId +"\nTimeStamp: "+timeStamp +"\nAmount: "+amount+"\nBalance in your wallet: "+user.wallet.getBalance() +"\nBalance in Receiver's wallet: "+user2.wallet.getBalance();
    }
}//Transfer