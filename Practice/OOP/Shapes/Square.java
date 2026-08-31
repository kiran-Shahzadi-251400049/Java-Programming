public class Square extends Shape{
	//Data members
	private double length;

	//Constructors
	public Square(){
		super();
		length=0;
	}//default-constructor

	public Square(double length, String color){
		super(color);
		this.length=length;
	}//overloaded-constructor

	//setter
	public void setLength(double length){
		this.length=length;
	}//setLength

	//getter
	public double getLength(){
		return length;
	}//getLength

	//Member methods
	public void draw(){
		System.out.println("Color: "+super.getColor());
		System.out.println("length: "+length);
	}//draw

	public double calculateArea(){
		return length*length;
	}//calculateArea

	public double calculatePerimeter(){
		return 4*length;
	}//calculatePerimeter

}//Square-class