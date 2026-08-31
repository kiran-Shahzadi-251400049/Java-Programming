public class Bird extends Pet{

	//Data members
	private String featherColor;
	private double wingSpan;
	private String beakType;
	private boolean canFly;


	//Constructors
	public Bird(){
		featherColor=null;
		wingSpan=0;
		beakType=null;
		canFly=false;
	}//Default 0-argument

	public Bird(String featherColor, double wingSpan, String beakType, boolean canFly){
		this.featherColor=featherColor;
		this.wingSpan=wingSpan;
		this.beakType=beakType;
		this.canFly=canFly;
	}//Overloaded 4-arguments

	public Bird(String eyeColor, double age, double weight, String location, String featherColor, double wingSpan, String beakType, boolean canFly){
		super(eyeColor, age, weight, location);
		this.featherColor=featherColor;
		this.wingSpan=wingSpan;
		this.beakType=beakType;
		this.canFly=canFly;
	}//Overloaded 8-arguments


	//Setters-Modifiers
	public void setFeatherColor(String featherColor){
		this.featherColor=featherColor;
	}//setFeatherColor

	public void setWingSpan(double wingSpan){
		this.wingSpan=wingSpan;
	}//setWingSpan

	public void setBeakType(String beakType){
		this.beakType=beakType;
	}//setBeakType

	public void setCanFly(boolean canFly){
		this.canFly=canFly;
	}//setCanFly


	//Getters-Accessors
	public String getFeatherColor(){
		return featherColor;
	}//getFeatherColor

	public double getWingSpan(){
		return wingSpan;
	}//getWingSpan

	public String getBeakType(){
		return beakType;
	}//getBeakType

	public boolean getCanFly(){
		return canFly;
	}//getCanFly


	//Other methods
	public void display(){
		super.display();
		System.out.println("Feather color: "+featherColor +", Wing-span: "+wingSpan +", Beak type: "+beakType +", It can fly: "+canFly);
	}//display

	public void squawk(){
		System.out.println("The bird is squawking");
	}//squawk

	public void fly(){
		if(canFly)
			System.out.println("The bird can fly");
		else
			System.out.println("The bird cann't fly");
	}

	public void eat(String foodType){
		System.out.println("Type of food eaten by the Bird: "+foodType);
	}//eat

}//Bird-class/Child1