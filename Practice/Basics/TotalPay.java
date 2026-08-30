import java.util.Scanner;

public class TotalPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of days worked: ");
        int days = input.nextInt();

        if (days < 1) {
            System.out.println("Number of days must be at least 1.");
        } else {
            double totalPay = 0;
            double dailyPay = 0.01; // 1 penny in dollars
            int day = 1;

            System.out.println("Day\tSalary ($)");

            while (day <= days) {
                System.out.printf("%d\t%.2f%n", day, dailyPay);
                totalPay += dailyPay;
                dailyPay *= 2;
                day++;
            }

            System.out.printf("Total Pay: $%.2f%n", totalPay);
        }

    }//main
}//class
