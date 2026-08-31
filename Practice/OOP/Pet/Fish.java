public class Fish extends Pet{

	//Data members
	private boolean jawless;
	private boolean dorslaFin;
	private int swimSpeed;


	//Constructors
	public Fish(){
		jawless=false;
		dorslaFin=false;
		swimSpeed=0;
	}//Default 0-argument 

	public Fish(boolean jawless, boolean dorslaFin, int swimSpeed){
		this.jawless=jawless;
		this.dorslaFin=dorslaFin;
		this.swimSpeed=swimSpeed;
	}//Overloaded 3-arguments

	public Fish(String eyeColor, double age, double weight, String location, boolean jawless, boolean dorslaFin, int swimSpeed){
		super(eyeColor, age, weight, location);
		this.jawless=jawless;
		this.dorslaFin=dorslaFin;
		this.swimSpeed=swimSpeed;
	}//Overloaded 7-arguments 


	//Setters-Modifiers
	public void setJawless(boolean jawless){
		this.jawless=jawless;
	}//setJawless

	public void setDorsalFin(boolean dorslaFin){
		this.dorslaFin=dorslaFin;
	}//setDorsalFin

	public void setSwimSpeed(int swimSpeed){
		this.swimSpeed=swimSpeed;
	}//setSwimSpeed


	//Getters-Accessors
	public boolean getJawless(){
		return jawless;
	}//getJawless

	public boolean getDorsalFin(){
		return dorslaFin;
	}//getDorsalFin

	public int getSwimSpeed(){
		return swimSpeed;
	}//getSwimSpeed


	//Other methods
	public void display(){
		super.display();
		System.out.println("Fish is jawlwss: "+jawless +", Fish has dorsal-fin: "+dorslaFin +", Swimming speed of fish: "+swimSpeed);
	}//display

	public void swim(String direction){
		System.out.println("Fish swims toward: "+direction);
	}//swim

	public void eat(String foodType){
		System.out.println("Type of food eaten by Fish: "+foodType);
	}//eat

}//Fish-class/Child3