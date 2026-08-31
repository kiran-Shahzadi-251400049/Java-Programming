public class Computer{

	//Data members
	private  HardDisk HARDDISK;
	private Ram RAM;
	private double price;
	private String make;


	//Constructor
	public Computer(){
		price=0;
		make=null;
	}//Default 1-argument

	public Computer(HardDisk HARDDISK, Ram RAM, double price, String make){

		this.price=price;
		this.make=make;

		this.HARDDISK=new HardDisk(HARDDISK);
		this.RAM=new Ram(RAM);

	}//Default 1-argument


	//Setters-modifiers
	public void setPrice(double price){
		this.price=price;
	}//setPrice

	public void setMake(String make){
		this.make=make;
	}//setMake


	//Getters-Accessors
	public double getPrice(){
		return price;
	}//getPrice

	public String getMake(){
		return make;
	}//getMake



	//Other methods
	public int getRamCapacity(){
		return (int)RAM.getCapacity();
	}//getRamCapacity

	public int getHardDiskCapacity(){
		return (int)HARDDISK.getCapacity();
	}//getHardDiskCapacity

	public boolean isRamCostly(){
		if(RAM.getPrice()>HARDDISK.getPrice())
			return true;
		else
			return false;
	}//isRamCostly

	public boolean isDiskSSD(){
		if(HARDDISK.getType().equals("SSD"))
			return true;
		else
			return false;
	}//isDiskSSD

	public void ComputerState(){
		HARDDISK.state();
		RAM.state();
		System.out.println("Price of Computer: "+price +", Make: "+make);
	}//ComputerState

}//Computer