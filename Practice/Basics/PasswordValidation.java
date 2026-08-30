//Correct Password is PF123
import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String CORRECT_PASSWORD = "PF123";
        int attempts = 0;
        boolean accessGranted = false;

        // LOOP for maximum 3 attempts
        while (attempts < 3 && accessGranted == false) {

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            // Check for empty input
            if (password.length() == 0) {
                System.out.println("Invalid input. Password cannot be empty.");
                continue;   // does NOT count as a wrong attempt
            }

            attempts++;

            if (password.equals(CORRECT_PASSWORD)) {
                accessGranted = true;
                System.out.println("Access Granted");
            } else {
                System.out.println("Wrong password.");
            }
        }

        // If access not granted after 3 attempts
        if (accessGranted == false) {
            System.out.println("Account Locked");
        }

    }//main
}//class
