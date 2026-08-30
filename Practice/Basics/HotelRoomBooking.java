import java.util.Scanner;

public class HotelRoomBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roomsBooked = 0;
        int totalRevenue = 0;
        final int ROOM_RATE = 100;

        // FOR LOOP
        for (int room = 1; room <= 10; room++) {

            System.out.print("Do you want to book room " + room + "? (Y/N): ");
            char choice = sc.next().charAt(0);

            if (choice == 'Y' || choice == 'y') {

                System.out.print("Enter guest name: ");
                sc.nextLine(); // consume leftover newline
                String guestName = sc.nextLine();

                System.out.print("Enter number of nights: ");
                int nights = sc.nextInt();

                int totalCost = nights * ROOM_RATE;

                // Update counters
                roomsBooked++;
                totalRevenue += totalCost;

                // Booking confirmation
                System.out.println("Booking Confirmed!");
                System.out.println("Guest Name: " + guestName);
                System.out.println("Total Cost: $" + totalCost);
                System.out.println("---------------------------");
            }
        }

        // Final summary
        System.out.println("\n--- Hotel Booking Summary ---");
        System.out.println("Total rooms booked: " + roomsBooked);
        System.out.println("Total revenue earned: $" + totalRevenue);

    }//main
}//class
