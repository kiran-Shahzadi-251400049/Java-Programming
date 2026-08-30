import java.util.Scanner;

public class VoucherCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user for amount spent
        System.out.print("Enter the amount spent on vinyl records: $: ");
        double amount = input.nextDouble();

        // Input validation
        if (amount <= 0) {
            System.out.println("Invalid Input!");
	        return;
        }

        double voucher;

        // Determine voucher percentage based on range
        if (amount <= 20) {
            voucher = amount * 0.05;  // 5%
        }
        else if (amount >= 21 && amount <= 50) {
            voucher = amount * 0.10;  // 10%
        }
        else if (amount > 50 && amount <= 100) {
            voucher = amount * 0.13;  // 13%
        }
        else if (amount > 100 && amount <= 220) {
            voucher = amount * 0.15;  // 15%
        }
        else { 
            voucher = amount * 0.17;  // > 220-17%
        }

        // Print result
        System.out.println("You earned a voucher worth: "+ voucher);

    }//main
}//class
