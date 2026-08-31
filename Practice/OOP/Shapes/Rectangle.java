public class Rectangle extends Square{
	//Data members
	private double width;

	//Constructors
	public Rectangle(){
		super();
		width=0;
	}//default-constructor

	public Rectangle(double width, double length, String color){
		super(length, color);
		this.width=width;
	}//overloaded-constructor

	//setter
	public void setWidth(double width){
		this.width=width;
	}//setWidth

	//getter
	public double getWidth(){
		return width;
	}//getWidth

	//Member methods
	public void draw(){
		super.draw();
		System.out.println("Width: "+width);
	}//draw

	public double calculateArea(){
		return super.getLength()*width;
	}//calculateArea

	public double calculatePerimeter(){
		return 2*(super.getLength()+width);
	}//calculatePerimeter

}//Rectangle-class