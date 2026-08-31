public abstract class Shape{
	//Data member
	private String color;

	//Constructors
	public Shape(){
		color="";
	}//default-constructor

	public Shape(String color){
		this.color=color;
	}//overloaded-constructor

	//setter
	public void setColor(String color){
		this.color=color;
	}//setColor

	//getter
	public String getColor(){
		return color;
	}//getColor;

	//Member Methods
	public abstract void draw();

	public abstract double calculateArea();

	public abstract double calculatePerimeter();

}//Shape-class