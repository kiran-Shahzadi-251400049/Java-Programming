public class UsingEmployees{
	public static void main(String[] args) {
	hourlyEmployee obj1 =new hourlyEmployee(15000, 15, "Subhan", 251);
	SalariedEmployee obj2=new SalariedEmployee(12000, "Kamran", 252);
	Manager obj3=new Manager(2000, 154000, "Qurban", 253);

	obj1.display();
	obj2.display();
	obj3.display();

	System.out.println("Pay of obj1: "+obj1.weeklyPay());
	System.out.println("Pay of obj2: "+obj2.weeklyPay());
	System.out.println("Pay of obj3: "+obj3.weeklyPay());

	}
}//UsingEmployees