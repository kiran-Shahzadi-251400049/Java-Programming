import java.util.Scanner;

public class IndexOfNthOccurence {

    // Method to find index of nth occurrence of a value
    public static int getNthIndex(int[] array, int occurrence, int value) {

        // Validate occurrence
        if (occurrence < 1) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                count++;

                if (count == occurrence) {
                    return i;   // nth occurrence found
                }
            }
        }

        return -1;  // value does not occur n times
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] array = new int[size];

        // Input array elements
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        // Input value and occurrence
        System.out.print("Enter value to search: ");
        int value = input.nextInt();

        System.out.print("Enter occurrence number (n): ");
        int occurrence = input.nextInt();

        // Validate occurrence in main (as required)
        if (occurrence < 1) {
            System.out.println("Error: Occurrence must be greater than or equal to 1.");
        } else {

            int index = getNthIndex(array, occurrence, value);

            if (index == -1) {
                System.out.println("The value does not occur " + occurrence + " times.");
            } else {
                System.out.println("The index of the " + occurrence +
                                   " occurrence of value " + value +
                                   " is: " + index);
            }
        }


    }//main
}//class