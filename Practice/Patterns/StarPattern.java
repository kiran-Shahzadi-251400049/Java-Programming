import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("\nSquare Star Pattern:");

        // Outer loop controls the rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop controls the stars in each row
            for (int j = 1; j <= rows; j++) {
                System.out.print("*  ");
            }

            System.out.println(); // Move to next line after each row
        }

    }//main
}//class
