public class Weapon{
//Data Members
	private String name;
	private String type;
	private int range;
	private String originCountry;


//Setters
	public void setName(String n){
		name=n;
	}//setName

	public void setType(String s){
		type=s;
	}//setType

	public void setRange(int r){
		range=r;
	}//setRange

	public void setOriginCountry(String oc){
		originCountry=oc;
	}//setOriginCountry


//Getters
	public String getName(){
		return name;
	}//getName

	public String getType(){
		return type;
	}//getType

	public int getRange(){
		return range;
	}//getRange

	public String getOriginCountry(){
		return originCountry;
	}//getOriginCountry


	public  boolean isCapableOfHitting(int distance){
		if(range>=distance){
			return true;
		}
		else 
			return false;
	}//isCapableOfHitting

}//class-weapon