public class HardDisk{
	//Data members
	private double price;
	private double capacity;
	private String type;

	//Constructor
	public HardDisk(){
		price=0;
		capacity=0;
		type=null;
	}//Dafault 0-argument

	public HardDisk(double price, double capacity, String type){
		this.price=price;
		this.capacity=capacity;
		this.type=type;
	}//Overloaded 3-arguments

	public HardDisk(HardDisk hd){
		this.price=hd.price;
		this.capacity=hd.capacity;
		this.type=hd.type;
	}//Copy constructor


	//Setters-modifiers
	public void setPrice(double price){
		this.price=price;
	}//setPrice

	public void setCapacity(double capacity){
		this.capacity=capacity;
	}//setCapacity

	public void setType(String type){
		this.type=type;
	}//setType


	//Getters-Accessors
	public double getPrice(){
		return price;
	}//getPrice

	public double getCapacity(){
		return capacity;
	}//getPrice

	public String getType(){
		return type;
	}//getPrice


	//Other method
	public void state(){
		System.out.println("Price of hard disk: "+price +", Capacity of hard disk: "+capacity +", Type of hard disk: "+type);
	}//state

}//HardDisk