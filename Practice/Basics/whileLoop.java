import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char choice = 'Y';   // loop control variable lcv

        // WHILE LOOP
        while (choice == 'Y' || choice == 'y') {

            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(sc.nextLine());

            int sum = num1 + num2;

            System.out.println("Sum = " + sum);

            System.out.print("Do you want to perform the operation again? (Y/y to continue): ");
            String input = sc.nextLine();
            choice = input.charAt(0);   // get single character
        }

        System.out.println("Program terminated.");

    }//main
}//class
