import java.util.Scanner;
import java.util.Random;

public class DiceRollSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int diceRoll = rand.nextInt(6) + 1;  // Random number between 1 and 6
        int prediction = 0;

        System.out.println("Welcome to the Dice Roll Game!");
        System.out.println("Try to predict the dice roll (number between 1 and 6).");

        // Loop until user guesses correctly
        while (prediction != diceRoll) {

            System.out.print("Enter your prediction: ");
            prediction = sc.nextInt();

            if (prediction < 1 || prediction > 6) {
                System.out.println("Invalid input! Enter a number between 1 and 6.");
                continue;  // Skip further checks, ask again
            }

            if (prediction == diceRoll) {
                System.out.println("Congratulations! You predicted the dice roll: " + diceRoll);
            } else {
                System.out.println("Wrong prediction. Try again!");
            }
        }

    }//main
}//class
