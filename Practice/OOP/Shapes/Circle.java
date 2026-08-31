public class Circle extends Shape{
	//Data Members
	private double x;
	private double y;
	private double radius;

	//Constructors
	public Circle(){
		super();
		x=0;
		y=0;
		radius=0;

	}//Default-Constructor

	public Circle(double x, double y, String color, double radius){
		super(color);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}//Overloaded-constructor

	//Setter
	public void setX(double x){
		this.x=x;
	}//setX

	public void setY(double y){
		this.y=y;
	}//setY

	public void setRadius(double radius){
		this.radius=radius;
	}//setRadius


	//Getter
	public double getX(){
		return x;
	}//getX

	public double getY(){
		return y;
	}//getY

	public double getRadius(){
		return radius;
	}//getRadius

	//Member Methods
	public void draw(){
		System.out.println("Color: "+super.getColor());
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		System.out.println("Radius: "+radius);
	}//draw

	public double calculateArea(){
		return Math.PI*radius*radius;
	}//calculateArea

	public double calculatePerimeter(){
		return 2*Math.PI*radius;
	}//calculatePerimeter

}//Circle-class