public class RunPayroll{
	public static void main(String[] args) {
		Payroll employee1 = new Payroll();
		Payroll employee2 = new Payroll();
		Payroll employee3 = new Payroll();

		employee1.setName("Name1");
		employee1.setId(123);
		employee1.setHourlyPay(500);
		employee1.setHoursWorked(5);

		employee2.setName("Name2");
		employee2.setId(125);
		employee2.setHourlyPay(600);

		System.out.println("State of employee 1:");
		employee1.display();

		System.out.println("\n\nState of employee 2:");
		employee2.display();

		employee3.Copy(employee1);
		System.out.println("\n\nCopying employee 1 in 3:");
		employee2.display();

	}//main
}//class