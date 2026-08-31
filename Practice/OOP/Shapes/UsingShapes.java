public class UsingShapes{
	public static void main(String[] args) {
		//Instances
		Square obj1=new Square(7.3, "Pink");
		Rectangle obj2=new Rectangle();
		Circle obj3=new Circle(2.5, 5.9, "Blue", 6.5);
		Rectangle obj4=new Rectangle(2.5, 7.8, "Purple");


		System.out.println("Object 1: ");
		obj1.draw();

		System.out.println("\nObject 2: ");
		obj2.draw();

		System.out.println("\nObject 3: ");
		obj3.draw();

		System.out.println("\nObject 4: ");
		obj4.draw();


		System.out.println("\nArea of object 1: "+obj1.calculateArea());
		System.out.println("Area of object 2: "+obj2.calculateArea());
		System.out.println("Area of object 3: "+obj3.calculateArea());
		System.out.println("Area of object 4: "+obj4.calculateArea());


		System.out.println("\nPerimeter of object 1: "+obj1.calculatePerimeter());
		System.out.println("Perimeter of object 2: "+obj2.calculatePerimeter());
		System.out.println("Perimeter of object 3: "+obj3.calculatePerimeter());
		System.out.println("Perimeter of object 4: "+obj4.calculatePerimeter());


		obj2.setWidth(5.8);
		obj2.setLength(3.9);
		obj2.setColor("Yellow");

		System.out.println("\nUpdated Area of object 2: "+obj2.calculateArea());
		System.out.println("Updated Perimeter of object 2: "+obj2.calculatePerimeter());


	}//main
	
}//UsingShape-class