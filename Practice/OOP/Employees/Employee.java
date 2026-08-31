public abstract class Employee{
	//Data member
	private String name;
	private int id;

	//Constructors
	public Employee(){
		name="";
		id=0;
	}//default-constructor

	public Employee(String name, int id){
		this.name=name;
		this.id=id;
	}//overloaded-constructor

	//setter
	public void setName(String name){
		this.name=name;
	}//setName

	public void setId(int id){
		this.id=id;
	}//setId

	//getter
	public String getName(){
		return name;
	}//getName;

	public int getId(){
		return id;
	}//getId;

	//Member Methods
	public abstract void display();

	public abstract double weeklyPay();

}//Employee-class