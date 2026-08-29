public class User{
    //Data Members
    private int userId;
    private String name;
    private String email;
    private String phoneNumber;
    private boolean isActive;
    protected Wallet wallet;

    //Constructors
    public User(){
        userId=0;
        name=null;
        email=null;
        phoneNumber=null;
        isActive=false;
        this.wallet=new Wallet();
    }

    public User(int userId,String name, String email, String phoneNumber, boolean isActive, Wallet wallet){ 
           this.userId=userId;
           this.name = name;
           this.email = email;
           this.phoneNumber = phoneNumber;
           this.isActive = isActive;
           this.wallet=new Wallet(wallet.getWalletId(), wallet.getBalance(), wallet.getCurrency(), wallet.getStatus());

    }//Overaded Or 4-Arg Constructor 
    


    // Mutators 
    public void setUserId(int userId){
        this.userId = userId;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setName(String name){
    this.name = name;
    }
    public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
    }
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }
    public void setWallet(Wallet wallet){
        this.wallet.setWalletId(wallet.getWalletId());
        this.wallet.setBalance(wallet.getBalance());
        this.wallet.setCurrency(wallet.getCurrency());
        this.wallet.setStatus(wallet.getStatus());
    }

    

    // Accessors
    public int getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public boolean getIsActive(){
        return isActive;
    }
    public Wallet getWallet(){
        return wallet;
    }
    

    // Display Method
    public void displayUserDetails(){
        System.out.println("User Id:"+userId);
        System.out.println("Name: "+name);
        System.out.println("Email : "+email);
        System.out.println("Phone Number Details: "+phoneNumber);
        System.out.println("Status is Active: "+isActive);
        System.out.println("Wallet details: ");
        wallet.displayDetails();
    }



}