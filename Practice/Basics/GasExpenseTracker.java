import java.util.Scanner;

public class GasExpenseTracker {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Enter total distance traveled (in miles): ");
        double distance = input.nextDouble();

        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price of fuel per gallon: ");
        double pricePerGallon = input.nextDouble();

        // Calculations
        double gallonsUsed = distance / milesPerGallon;
        double totalCost = gallonsUsed * pricePerGallon;
        double costPer100Miles = (totalCost / distance) * 100;

        // Display results
        System.out.println("\n--- Gas Expense Summary ---");
        System.out.println("Gallons used: " + gallonsUsed);
        System.out.println("Total cost of gas: $" + totalCost);
        System.out.println("Cost per 100 miles: $" + costPer100Miles);

        
    }//main
}//class