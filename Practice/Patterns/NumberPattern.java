import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = 0;

        // Input validation loop
        while (rows < 1) {
            System.out.print("Enter the number of rows (must be ≥ 1): ");
            rows = sc.nextInt();

            if (rows < 1) {
                System.out.println("Invalid input! Please enter a number greater than or equal to 1.");
            }
        }

        System.out.println("\nNumber Pattern:");

        // Outer loop: controls rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop: prints numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // move to next row
        }

    }//main
}//class
