import java.util.Scanner;

public class CarpetCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take inputs from user
        System.out.print("Enter number of rooms already carpeted: ");
        int roomsCarpeted = input.nextInt();

        System.out.print("Enter total carpet used for these rooms (in square feet): ");
        double carpetUsed = input.nextDouble();

        System.out.print("Enter number of rooms you want to carpet: ");
        int roomsToCarpet = input.nextInt();

        // Calculate carpet per room
        double carpetPerRoom = carpetUsed / roomsCarpeted;

        // Calculate required carpet
        double carpetNeeded = carpetPerRoom * roomsToCarpet;

        // Display result
        System.out.println("\nCarpet required for " + roomsToCarpet + " rooms: " + carpetNeeded + " square feet");

    }//main
}//class
