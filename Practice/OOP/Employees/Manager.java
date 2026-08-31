public class Manager extends SalariedEmployee{
	//Data member
	private double weeklyBonus;

	//Constructors
	public Manager(){
		super();
		weeklyBonus=0;
	}//default-constructor

	public Manager(double weeklyBonus){
		this.weeklyBonus=weeklyBonus;
	}//overloaded-constructor

	public Manager(double weeklyBonus, double annualSalary, String name, int id){
		super(annualSalary, name, id);
		this.weeklyBonus=weeklyBonus;
	}//overloaded-constructor


	//setter
	public void setWeeklyBonus(double weeklyBonus){
		this.weeklyBonus=weeklyBonus;
	}//setWeeklyBonus

	//getter
	public double getWeeklyBonus(){
		return weeklyBonus;
	}//getWeeklyBonus;

	//Member Methods
	public void display(){
		super.display();
		System.out.println("Weekly Bonus: "+weeklyBonus);
	}//display

	public double weeklyPay(){
		return super.weeklyPay()*weeklyBonus;
	}//weeklyPay

}//Manager-class