import java.util.Scanner;

public class VehicleSpeed {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read three integers
        System.out.print("Enter first speed value: ");
        int a = input.nextInt();

        System.out.print("Enter second speed value: ");
        int b = input.nextInt();

        System.out.print("Enter third speed value: ");
        int c = input.nextInt();

        // Check ascending order OR descending order
        if ((a <= b && a <= c) || (a >= b && a >= c)) {
            System.out.println("Speeds are consitent.");
        } else {
            System.out.println("Speeds are inconsitent.");
        }
    }//main
}//class
