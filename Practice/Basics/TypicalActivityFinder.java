import java.util.Scanner;

public class TypicalActivityFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day (1 = Monday ... 7 = Sunday): ");
        int day = input.nextInt();

        // Validate day
        if (day < 1 || day > 7) {
            System.out.println("Invalid day!");
            return;
        }

        System.out.print("Enter a time (1=Morning, 2=Afternoon, 3=Evening, 4=Night): ");
        int time = input.nextInt();

        // Validate time
        if (time < 1 || time > 4) {
            System.out.println("Invalid time!");
            return;
        }

        String activity = "";

        // Weekdays (1 to 5)
        if (day >= 1 && day <= 5) {

            if (time == 1)
                activity = "Going to school or work";
            else if (time == 2)
                activity = "At school/work or having lunch";
            else if (time == 3)
                activity = "Doing homework or relaxing";
            else if (time == 4)
                activity = "Sleeping";

        }
        // Weekend (6 or 7)
        else if (day == 6 || day == 7) {

            if (time == 1)
                activity = "Relaxing or enjoying a late breakfast";
            else if (time == 2)
                activity = "Shopping or visiting friends";
            else if (time == 3)
                activity = "Going to a movie or outing";
            else if (time == 4)
                activity = "Sleeping";
        }

        System.out.println("Typical activity: " + activity);
    }//main
}//class

