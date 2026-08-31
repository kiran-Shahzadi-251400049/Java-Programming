public class Pet{

	//Data members
	private String eyeColor;
	private double age;
	private double weight;
	private String location;


	//Constructors
	public Pet(){
		eyeColor=null;
		age=0;
		weight=0;
		location=null;
	}//Default 0-argument

	public Pet(String eyeColor, double age, double weight, String location){
		this.eyeColor=eyeColor;
		this.age=age;
		this.weight=weight;
		this.location=location;
	}//Overloaded 4-Arguments


	//Setters-Modifiers
	public void setEyeColor(String eyeColor){
		this.eyeColor=eyeColor;
	}//setEyeColor

	public void setAge(double age){
		this.age=age;
	}//setAge

	public void setWeight(double weight){
		this.weight=weight;
	}//setWeight

	public void setLocation(String location){
		this.location=location;
	}//setLocation


	//Getters-Accessors
	public String getEyeColor(){
		return eyeColor;
	}//getEyeColor

	public double getAge(){
		return age;
	}//getAge

	public double getWeight(){
		return weight;
	}//getWeight

	public String getLocation(){
		return location;
	}//getLocation


	//Other methods
	public void display(){
		System.out.println("Eye Color: "+eyeColor +", Age: "+age +", Weight: "+weight +", Location: "+location);
	}//display

	public void eat(String foodType){
		System.out.println("Type of food eaten by the Pet: "+foodType);
	}//eat

	public void sleep(double timeLength){
		System.out.println("Sleep time of Pet: "+timeLength +"hours");
	}//sleep

}//Pet/Parent-class