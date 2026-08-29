public interface Authenticable{
	public abstract boolean isAuthentical(User user);
	public abstract boolean login(User user,String password);
	public abstract void logout();
}//Authenticable