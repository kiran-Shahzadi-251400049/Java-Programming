import java.util.Scanner;
public class RetailItem{
	//Data members
	private String description;
	private int unitsOnHand;
	private double price;


	//Constructor
	public RetailItem(){
		description="Write Description";
		unitsOnHand=40;
		price=1000;
	}

	//Inputs
	public void input(){	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter description:");
		String d = input.nextLine();
		setDescription(d);

		System.out.print("Enter units On Hand:");
		int u = input.nextInt();
		setUnitsOnHand(u);

		System.out.print("Enter price:");
		double p = input.nextDouble();
		setPrice(p);
	}//input 

	//Output
	public void output(){	
		System.out.println("Description:"+ description);
		System.out.println("Units On Hand:"+ unitsOnHand);
		System.out.println("Price:"+ price);

	}//output 

	//Mutators
	public void setDescription(String d){
		description=d;	
	}

	public void setUnitsOnHand(int u){
		unitsOnHand=u;	
	}

	public void setPrice(double p){
		price=p;
	}

	//Accessors
	public String getDescription(){
		return description;
	}

	public int getUnitsOnHand(){
		return unitsOnHand;
	}

	public double getPrice(){
		return price;
	}

}//class