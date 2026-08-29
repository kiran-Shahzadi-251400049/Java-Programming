public class Withdraw extends Transaction{
    //Data Member
    private boolean isOtpVerified;
    private User user;

    //Constructors
    public Withdraw(){
        isOtpVerified=false;
        transactionId=0;
        timeStamp=null;
        amount=0;
        user=new User();
    }
    public Withdraw(boolean isOtpVerified, int transactionId, String timeStamp, double amount, User user){
        this.isOtpVerified=isOtpVerified;
        this.transactionId=transactionId;
        this.timeStamp=timeStamp;
        this.amount=amount;
        this.user=user;
    }


    //Setters
    public void setIsOtpVerified(boolean isOtpVerified){
        this.isOtpVerified=isOtpVerified;
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
    public boolean getIsOtpVerified(){
        return isOtpVerified;
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
    public void withdraw(double amount, boolean isOtpVerified){
        if(amount <= user.wallet.getBalance()){
            if(isOtpVerified==true){
                user.wallet.setBalance(user.wallet.getBalance()-amount);
                System.out.println("\nWithdrawing "+amount +" from your wallet...");
            }
            else {
                System.out.println("\nOtp is not verified!");
            }
        }else{
            System.out.println("\nBalance is insufficient.");
        }
    }

    public String getDetails(){
        return "Otp is Verified: "+isOtpVerified+"\nTransaction Id: "+transactionId +"\nTimeStamp: "+timeStamp +"\nAmount: "+amount+"\nBalnce in your wallet: "+user.wallet.getBalance();
    }
}
