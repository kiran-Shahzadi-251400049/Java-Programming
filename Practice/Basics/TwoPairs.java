import java.util.Scanner;

public class TwoPairs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read 4 integers
        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        System.out.print("Enter fourth integer: ");
        int d = input.nextInt();

        // Check for two pairs directly in the if condition
        if ( (a == b && c == d && a != c) || (a == c && b == d && a != b) || (a == d && b == c && a != b) ) 
        {
            System.out.println("There exist two pairs.");
        } 
        else 
        {
            System.out.println("There do not exist two pairs.");
        }

    }//main
}//class
