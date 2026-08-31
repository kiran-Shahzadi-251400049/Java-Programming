public class SalariedEmployee extends Employee{
	//Data member
	private double annualSalary;

	//Constructors
	public SalariedEmployee(){
		super();
		annualSalary=0;
	}//default-constructor

	public SalariedEmployee(double annualSalary){
		this.annualSalary=annualSalary;
	}//overloaded-constructor

	public SalariedEmployee(double annualSalary, String name, int id){
		super(name, id);
		this.annualSalary=annualSalary;
	}//overloaded-constructor


	//setter
	public void setAnnualSalary(double annualSalary){
		this.annualSalary=annualSalary;
	}//setAnnualSalary

	//getter
	public double getAnnualSalary(){
		return annualSalary;
	}//getAnnualSalary;

	//Member Methods
	public void display(){
		System.out.println("Name: "+super.getName() +"\nId: "+super.getId() +"\nAnnual Salary: "+annualSalary);
	}//display

	public double weeklyPay(){
		return annualSalary/52;
	}//weeklyPay

}//SalariedEmployee-class