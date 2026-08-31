public class hourlyEmployee extends Employee{
	//Data member
	private double hourlyWage;
	private int hoursWorkedPerWeek;

	//Constructors
	public hourlyEmployee(){
		super();
		hourlyWage=0;
		hoursWorkedPerWeek=0;
	}//default-constructor

	public hourlyEmployee(double hourlyWage, int hoursWorkedPerWeek){
		this.hourlyWage=hourlyWage;
		this.hoursWorkedPerWeek=hoursWorkedPerWeek;
	}//overloaded-constructor

	public hourlyEmployee(double hourlyWage, int hoursWorkedPerWeek, String name, int id){
		super(name, id);
		this.hourlyWage=hourlyWage;
		this.hoursWorkedPerWeek=hoursWorkedPerWeek;
	}//overloaded-constructor


	//setter
	public void setHourlyWage(double hourlyWage){
		this.hourlyWage=hourlyWage;
	}//setHourlyWage

	public void setHoursWorkedPerWeek(int hoursWorkedPerWeek){
		this.hoursWorkedPerWeek=hoursWorkedPerWeek;
	}//setHoursWorkedPerWeek

	//getter
	public double getHourlyWage(){
		return hourlyWage;
	}//getHourlyWage;

	public int getHoursWorkedPerWeek(){
		return hoursWorkedPerWeek;
	}//getHoursWorkedPerWeek;

	//Member Methods
	public void display(){
		System.out.println("Name: "+super.getName()+"\nId: "+getId() +"\nHourly Wage: "+hourlyWage+"\nHours Worked per Week: "+hoursWorkedPerWeek);
	}//display

	public double weeklyPay(){
		double pay=0;
		int extraHours=0;
		double extraPay=0;
		if(hoursWorkedPerWeek>40){
			extraHours=hoursWorkedPerWeek-40;
			pay=hourlyWage*hoursWorkedPerWeek;
			extraPay=extraHours*(hourlyWage*1.5);
			pay+=extraPay;
		}
		else{
			pay=hourlyWage*hoursWorkedPerWeek;
		}
		return pay;
	}//weeklyPay

}//Employee-class