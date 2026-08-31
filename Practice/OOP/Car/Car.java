import java.util.Scanner;
public class Car{
	//Data Members
	private int yearModel;
	private String make;
	private int speed;


	public void input(){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter model year = ");
		int ym = input.nextInt();
		setYearModel(ym);

		input.nextLine();
		System.out.print("Enter make = ");
		String m = input.nextLine();
		setMake(m);

		System.out.print("Enter speed = ");
		int s = input.nextInt();
		setSpeed(s);

	}//input

	//Setters
	public void setYearModel(int ym){
		yearModel=ym;
	}//set-yearModel

	public void setMake(String m){
		make=m;
	}//set-make

	public void setSpeed(int s){
		speed=s;
	}//set-speed


	//Getters
	public int getYearModel(){
		return yearModel;
	}//get-yearModel

	public String getMake(){
		return make;
	}//get-make

	public int getSpeed(){
		return speed;
	}//get-speed

	//Constructor
	public Car(){
		yearModel=2005;
		make="Toyota";
		speed=250;
	}//Constructor

	public void accelerate(){
		speed+=5;
	}//accelerate

	public void brake(){
		speed-=5;
	}//brake

}//Car