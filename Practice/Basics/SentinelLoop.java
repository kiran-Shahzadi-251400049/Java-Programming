import java.util.Scanner;

public class SentinelLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("Sports Game Scorekeeper");
        System.out.println("Enter player scores. Enter -111 to stop.");

        System.out.print("Enter score: ");
        int score = sc.nextInt();  // first input

        // Sentinel-controlled loop
        while (score != -111) {

            // Optional: prevent negative scores
            if (score < 0) {
                System.out.println("Invalid input! Score cannot be negative. Try again.");
            } else {
                totalScore += score;
                System.out.println("Current Total Score: " + totalScore);
            }

            // Ask for next input
            System.out.print("Enter score: ");
            score = sc.nextInt();
        }

        System.out.println("\nFinal Total Score: " + totalScore);
        System.out.println("Scorekeeping ended.");

    }//main
}//class
