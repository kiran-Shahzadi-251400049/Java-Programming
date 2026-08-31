import java.util.Scanner;
public class Payroll{
	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private double numberOfHoursWorked;

	//Constructors
	public Payroll(){
		name="Write name";
		idNumber=0;
		hourlyPayRate=0;
		numberOfHoursWorked=0;
	}//default 0-argument

	public Payroll(String n, int i){
		name=n;
		idNumber=i;
	}//2-arguments

	public Payroll(Payroll p){
		this.name=p.name;
		idNumber=0;
		hourlyPayRate=0;
		numberOfHoursWorked=0;
	}//Copy Constructor


	//setters
	public void setName(String n){
		name=n;
	}

	public void setId(int id){
		idNumber=id;
	}

	public void setHourlyPay(double hp){
		hourlyPayRate=hp;
	}

	public void setHoursWorked(double nh){
		numberOfHoursWorked=nh;
	}

	//getters
	public String getName(){
		return name;
	}

	public int getId(){
		return idNumber;
	}

	public double getHourlyPay(){
		return hourlyPayRate;
	}

	public double getHoursWorked(){
		return numberOfHoursWorked;
	}


	//Member Methods
	public void display(){
		System.out.println("Name: "+name +"\nId number: "+idNumber +"\nHourly pay rate: "+hourlyPayRate +"\nNumbers of hours worked: "+numberOfHoursWorked);
	}//display

	public double grossPay(){
		return hourlyPayRate*numberOfHoursWorked;
	}//grossPay

	public Payroll create(Payroll p){
		Payroll obj = new Payroll();
		obj.name = this.name +","+ p.name;
		obj.idNumber = this.idNumber+p.idNumber;
		obj.hourlyPayRate = this.hourlyPayRate+p.hourlyPayRate;
		obj.numberOfHoursWorked = this.numberOfHoursWorked+p.numberOfHoursWorked;
		return obj;
	}//create

	public void Copy(Payroll p){
		this.name = p.name;
		this.idNumber = p.idNumber;
		this.hourlyPayRate = p.hourlyPayRate;
		this.numberOfHoursWorked = p.numberOfHoursWorked;
	}//copy

	public String toString(){
		return "Name: "+name +", Id: "+idNumber +", Pay per hour: "+hourlyPayRate +", Hours worked: "+numberOfHoursWorked;
	}//toString

	public boolean compare(Payroll p){
		if(this.name.equals(p.name) && this.idNumber==p.idNumber && this.hourlyPayRate==p.hourlyPayRate && this.numberOfHoursWorked==p.numberOfHoursWorked){
			return true;
		}
		else{
			return false;
		}
	}//compare

	public boolean isNotEqual(Payroll p){
		if(!(this.name.equals(p.name)) && this.idNumber!=p.idNumber && this.hourlyPayRate!=p.hourlyPayRate && this.numberOfHoursWorked!=p.numberOfHoursWorked){
			return true;
		}
		else{
			return false;
		}
	}//isNotEqual

}//class