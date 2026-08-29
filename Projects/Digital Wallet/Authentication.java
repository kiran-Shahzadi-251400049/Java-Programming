public class Authentication implements Authenticable {
    //Data Member
    private User user;

    //Constructors
    public Authentication(){
        user=new User();
    }
    public Authentication(User user){
        this.user=new User(user.getUserId(), user.getName(), user.getEmail(), user.getPhoneNumber(), user.getIsActive(), user.getWallet());
    }


    //Setter
    public void setUser(User user){
        this.user=new User(user.getUserId(), user.getName(), user.getEmail(), user.getPhoneNumber(), user.getIsActive(), user.getWallet());
    }

    //Getter
    public User getUser(){
        return user;
    }

    //Overidden Methods
    public boolean login(User user, String password){
        this.user=new User(user.getUserId(),user.getName(), user.getEmail(), user.getPhoneNumber(), user.getIsActive(), user.getWallet());
        if(this.user != null && password != null){
            return true;
        }else{
            return false;
        }
    }//login
    
    public void logout(){
        System.out.println("Logged out successfully");
    }//logout

    public boolean isAuthentical(User user){
        this.user=new User(user.getUserId(),user.getName(), user.getEmail(), user.getPhoneNumber(), user.getIsActive(), user.getWallet());
        if(this.user.getPhoneNumber().length()==11 && this.user.getName()!=null && this.user.getEmail()!=null){
            return true;
        }
        else {
            return false;
        }
    }//isAuthentical

}
