import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();

        // Input validation
        if (month < 1 || month > 12) {
            System.out.println("Invalid input!");
        }
        else if (month == 2) {
            System.out.println("28 days");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        }
        else {
            System.out.println("31 days");
        }

    }//main
}//class
