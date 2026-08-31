//Customer

class Customer{
	//Data Members
	private String customerName;
	private int customerId;

	//Constructors
	public Customer(){
		customerName=null;
		customerId=0;
	}
	public Customer(String customerName, int customerId){
		this.customerName=customerName;
		this.customerId=customerId;
	}

	//Setters
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public void setCustomerId(int customerId){
		this.customerId=customerId;
	}

	//Getters
	public String getCustomerName(){
		return customerName;
	}
	public int getCustomerId(){
		return customerId;
	}

	//Other Methods
	public void showDetails(){
		System.out.println("Customer Name: "+customerName +"\nCustomer Id: "+customerId);
	}

}//Customer-Class



//BikeShowroom

class BikeShowroom{
	//Data Members
	private String showroomName;
	private String location;
	private String ownerName;
	private Manager manager;

	//Constructors
	public BikeShowroom(){
		showroomName=null;
		location=null;
		ownerName=null;
		manager=new Manager();
	}
	public BikeShowroom(String showroomName, String location, String ownerName, Manager obj){
		this.showroomName=showroomName;
		this.location=location;
		this.ownerName=ownerName;
		manager=new Manager(obj.getManagerName(), obj.getManagerId());
	}
	public BikeShowroom(Manager obj){
		manager=new Manager(obj.getManagerName(), obj.getManagerId());
	}

	//Setters
	public void setShowroomName(String showroomName){
		this.showroomName=showroomName;
	}
	public void setLocation(String location){
		this.location=location;
	}
	public void setOwnerName(String ownerName){
		this.ownerName=ownerName;
	}

	//Getters
	public String getShowroomName(){
		return showroomName;
	}
	public String getLocation(){
		return location;
	}
	public String getOwnerName(){
		return ownerName;
	}

	//Other Methods
	public void showDetails(){
		manager.showDetails();
		System.out.println("Showroom Name: "+showroomName +"\nLocation: "+location +"\nOwner Name: "+ownerName);
	}
	public void showAllBikes(Bike[] bikeList){
		for(int i=0; i<bikeList.length; i++){
			bikeList[i].showDetails();
			System.out.println();
		}
	}
	
}//BikeShowroom-Class



//Manager

class Manager{
	//Data Members
	private String managerName;
	private int managerId;

	//Constructors
	public Manager(){
		managerName=null;
		managerId=0;
	}
	public Manager(String managerName, int managerId){
		this.managerName=managerName;
		this.managerId=managerId;
	}

	//Setters
	public void setManagerName(String managerName){
		this.managerName=managerName;
	}
	public void setManagerId(int managerId){
		this.managerId=managerId;
	}

	//Getters
	public String getManagerName(){
		return managerName;
	}
	public int getManagerId(){
		return managerId;
	}

	//Other Methods
	public void showDetails(){
		System.out.println("Manager Name: "+managerName +"\nManager Id: "+managerId);
	}
	
}//Manager-Class



//Bike

class Bike{
	//Data Members
	private String modelName;
	private String company;
	private int stock;
	private double price;

	//Constructors
	public Bike(){
		modelName=null;
		company=null;
		stock=0;
		price=0;
	}
	public Bike(String modelName, String company, int stock, double price){
		this.modelName=modelName;
		this.company=company;
		this.stock=stock;
		this.price=price;
	}

	//Setters
	public void setModelName(String modelName){
		this.modelName=modelName;
	}
	public void setCompany(String company){
		this.company=company;
	}
	public void setStock(int stock){
		this.stock=stock;
	}
	public void setPrice(double price){
		this.price=price;
	}

	//Getters
	public String getModelName(){
		return modelName;
	}
	public String getCompany(){
		return company;
	}
	public int getStock(){
		return stock;
	}
	public double getPrice(){
		return price;
	}

	//Other Methods
	public void addStock(int quantity){
		stock+=quantity;

	}
	public void sellBike(int quantity){
		if(stock>=quantity){
			stock-=quantity;
		}
		else {
			System.out.println("Insufficient Stock");
		}
	}
	public void showDetails(){
		System.out.println("Model Name: "+modelName +"\nCompany: "+company +"\nStock: "+stock +"\nPrice: "+price);
	}
	
}//Bike-Class



//ElectricBike

class ElectricBike extends Bike{
	//Data Members
	private int batteryCapacity;
	private double chargingTime;

	//Constructors
	public ElectricBike(){
		super();
		batteryCapacity=0;
		chargingTime=0;
	}
	public ElectricBike(String modelName, String company, int stock, double price, int batteryCapacity, double chargingTime){
		super(modelName, company, stock, price);
		this.batteryCapacity=batteryCapacity;
		this.chargingTime=chargingTime;
	}

	//Other Methods
	public void showDetails(){
		super.showDetails();
		System.out.println("Battery Capacity: "+batteryCapacity +"\nCharging Time: "+chargingTime);
	}
	
}//ElectricBike-Class



//SportsBike

class SportsBike extends Bike{
	//Data Members
	private int topSpeed;

	//Constructors
	public SportsBike(){
		super();
		topSpeed=0;
	}
	public SportsBike(String modelName, String company, int stock, double price, int topSpeed){
		super(modelName, company, stock, price);
		this.topSpeed=topSpeed;
	}

	//Other Methods
	public void showDetails(){
		super.showDetails();
		System.out.println("Top Speed: "+topSpeed);
	}
	
}//SportsBike-Class



//BikeShowroom_ManagementSystem

class BikeShowroom_ManagementSystem{

	public static void main(String[] args) {

		BikeShowroom bs=new BikeShowroom("Ishfaq Automobile", "Sialkot Bypass", "Ishfaq Ahmad", new Manager("Kamran", 45678));
		System.out.println("Bike Showroom: ");
		bs.showDetails();

		Customer c=new Customer("Habib", 2341);
		System.out.println("\nCustomer Details: ");
		c.showDetails();

		Bike[] bikeList = new Bike[5]; 
		bikeList[0]=new Bike("Honda 70", "Honda", 62, 160000.3);
		bikeList[1]=new SportsBike("Yamaha R1", "Yamaha", 7, 170000, 280);
		bikeList[2]=new SportsBike("Suzuki R2", "Suzuki", 5, 180000, 300);
		bikeList[3]=new ElectricBike("Revoo A11", "Revoo", 30, 150000, 5, 8.5);
		bikeList[4]=new ElectricBike("Metro S12", "Metro", 20, 140000 , 4, 7);
		System.out.println("\nList of Bikes: ");
		bs.showAllBikes(bikeList);

		System.out.println("\nUpdating stock of bikes:");
		System.out.println("\nAdding 5 in Honda bikes stock..");
		bikeList[0].addStock(5);
		System.out.println("\nSelling 4 Yamaha sports bikes..");
		bikeList[1].sellBike(4);
		System.out.println("\nSelling 10 Suzuki sports bikes..");
		bikeList[2].sellBike(10);
		System.out.println("\nSelling 31 Revoo e-bikes..");
		bikeList[3].sellBike(31);
		System.out.println("\nAdding 10 in Metro e-bikes stock..");
		bikeList[4].addStock(10);

		System.out.println("\nUpdated List of bikes: ");
		bs.showAllBikes(bikeList);

	}//main
	
}//BikeShowroom_ManagementSystem-Class