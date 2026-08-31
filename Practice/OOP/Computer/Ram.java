public class Ram{
	//Data members
	private double price;
	private double capacity;

	//Constructor
	public Ram(){
		price=0;
		capacity=0;
	}//Dafault 0-argument

	public Ram(double price, double capacity){
		this.price=price;
		this.capacity=capacity;
	}//Overloaded 2-arguments

	public Ram(Ram rm){
		this.price=rm.price;
		this.capacity=rm.capacity;
	}//Copy constructor


	//Setters-modifiers
	public void setPrice(double price){
		this.price=price;
	}//setPrice

	public void setCapacity(double capacity){
		this.capacity=capacity;
	}//setCapacity



	//Getters-Accessors
	public double getPrice(){
		return price;
	}//getPrice

	public double getCapacity(){
		return capacity;
	}//getPrice



	//Other method
	public void state(){
		System.out.println("Price of Ram: "+price +", Capacity of Ram: "+capacity );
	}//state
}//Ram