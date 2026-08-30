import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read an integer from user
        System.out.print("Enter an integer (up to 5 digits): ");
        int number = input.nextInt();

        // Break the number into individual digits
        int d1 = number / 10000;              // first digit
        int d2 = (number / 1000) % 10;        // second digit
        int d3 = (number / 100) % 10;         // third digit
        int d4 = (number / 10) % 10;          // fourth digit
        int d5 = number % 10;                 // fifth digit

        // Display digits
        System.out.println("Digits:");
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);

    }//main
}//class
