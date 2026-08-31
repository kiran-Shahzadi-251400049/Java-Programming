public class Cat extends Pet{

	//Data members
	private String furColor;
	private String whiskerColor;
	private double furLength;
	private int toeNumber;


	//Constructors
	public Cat(){
		furColor=null;
		whiskerColor=null;
		furLength=0;
		toeNumber=0;
	}//Default 0-argument

	public Cat(String furColor, String whiskerColor, double furLength, int toeNumber){
		this.furColor=furColor;
		this.whiskerColor=whiskerColor;
		this.furLength=furLength;
		this.toeNumber=toeNumber;
	}//Overloaded 4-arguments

	public Cat(String eyeColor, double age, double weight, String location, String furColor, String whiskerColor, double furLength, int toeNumber){
		super(eyeColor, age, weight, location);
		this.furColor=furColor;
		this.whiskerColor=whiskerColor;
		this.furLength=furLength;
		this.toeNumber=toeNumber;
	}//Overloaded 8-arguments


	//Setters-Modifiers
	public void setFurColor(String furColor){
		this.furColor=furColor;
	}//setFurColor

	public void setWhiskerColor(String whiskerColor){
		this.whiskerColor=whiskerColor;
	}//setWhiskerColor

	public void setFurLength(double furLength){
		this.furLength=furLength;
	}//setFurLength

	public void setToeNumber(int toeNumber){
		this.toeNumber=toeNumber;
	}//setToeNumber


	//Getters-Accessors
	public String getFurColor(){
		return furColor;
	}//getFurColor

	public String getWhiskerColor(){
		return whiskerColor;
	}//getWhiskerColor

	public double getFurLength(){
		return furLength;
	}//getFurLength

	public int getToeNumber(){
		return toeNumber;
	}//getToeNumber


	//Other methods
	public void display(){
		super.display();
		System.out.println("Fur color: "+furColor +", Whisker color: "+whiskerColor +", Fur length: "+furLength +", Toe number: "+toeNumber);
	}//display

	public void purr(int soundLevel){
		System.out.println("Sound level of cat's purring: "+soundLevel);
	}//purr

	public void meow(){
		System.out.println("Meow!");
	}//meow

	public void eat(String foodType){
		System.out.println("Type of food eaten by Cat: "+foodType);
	}//eat

}//Cat-class/Child2