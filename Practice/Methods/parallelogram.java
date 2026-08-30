import java.util.Scanner;
public class parallelogram
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter base:");
		double base = input.nextDouble();
		if(base<=0)
		{
			System.out.print("Enter a valid base:");
			base = input.nextDouble();
		}//if

		System.out.print("Enter height:");
		double height = input.nextDouble();
		if(height<=0)
		{
			System.out.print("Enter a valid height:");
			height= input.nextDouble();
		}//if

		calculate(base, height);
	}//main

	public static void calculate(double base, double height)
	{
		if(base==height)
		{
			double area=base*base;  
			System.out.println("Area of Square: "+ area);

			double perimeter=4*base;	 
			System.out.print("Perimeter of Square: "+perimeter);
		}//if

		else 
		{
			double area=base*height;
			System.out.println("Area of Square: "+ area);

			double perimeter=2*(base+height);
			System.out.print("Perimeter of Square: "+perimeter);
		}//else
	}//calculate
}//class