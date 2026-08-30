import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalFine = 0;
        int noFineBooks = 0;
        int maxFine = 0;

        // FOR LOOP: input for 10 books
        for (int book = 1; book <= 10; book++) {

            System.out.print("Enter number of days overdue for book " + book + ": ");
            int daysOverdue = sc.nextInt();

            int fine = daysOverdue * 2;

            // WHILE LOOP
            int check = 1;
            while (check == 1) {

                if (daysOverdue == 0) {
                    noFineBooks++;
                }

                if (fine > maxFine) {
                    maxFine = fine;
                }

                totalFine += fine;
                check++;   // exit while loop
            }
        }

        // Display results
        System.out.println("\n--- Library Fine Summary ---");
        System.out.println("Total fine collected: $" + totalFine);
        System.out.println("Number of books with no fine: " + noFineBooks);
        System.out.println("Maximum fine for a single book: $" + maxFine);

    }//main
}//class
