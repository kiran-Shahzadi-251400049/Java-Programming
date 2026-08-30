import java.util.Scanner;

public class EmployeeWorkingHours {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int moreThan8 = 0;
        int eightOrLess = 0;
        int max = 0;
        int min = 0;

        int count = 1;

        // WHILE LOOP
        while (count <= 15) {

            System.out.print("Enter working hours of employee " + count + ": ");
            int hours = sc.nextInt();   

            if (count == 1) {
                max = hours;
                min = hours;
            }

            if (hours > 8) {
                moreThan8++;
            } else {
                eightOrLess++;
            }

            if (hours > max) {
                max = hours;
            }

            if (hours < min) {
                min = hours;
            }

            count++;
        }

            System.out.println("\n--- Employee Working Hours Summary ---");
            System.out.println("Employees who worked more than 8 hours: " + moreThan8);
            System.out.println("Employees who worked 8 hours or less: " + eightOrLess);
            System.out.println("Maximum working hours: " + max);
            System.out.println("Minimum working hours: " + min);

    }//main
}//class
