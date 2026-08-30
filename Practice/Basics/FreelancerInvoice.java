import java.util.Scanner;

public class FreelancerInvoice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read freelancer name
        System.out.print("Enter freelancer name: ");
        String name = input.nextLine();

        // Read hourly wage
        System.out.print("Enter hourly wage: ");
        double wage = input.nextDouble();

        // Read hours worked (fraction allowed)
        System.out.print("Enter hours worked in the past month: ");
        double hours = input.nextDouble();

        

        double pay;

        // Calculate normal or overtime pay
        if (hours > 160) {
            double extraHours = hours - 160;
            pay = (160 * wage) + (extraHours * wage * 2); // overtime at double wage
        }else if(hours == 0) {
            System.out.println("Invalid input. Working hours cannot be 0.");
            return; // stop program
        }else {
            pay = hours * wage;
        }
	


        // Print invoice
        System.out.println("\n----- Freelancer Invoice -----");
        System.out.println("Name: " + name);
        System.out.println("Hourly Wage: $" + wage);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Total Pay: $" + pay);
        System.out.println("------------------------------");

        input.close();
    }
}
