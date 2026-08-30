import java.util.Scanner;

public class CopyReversedArray {

    // Method to copy source array into target in reverse order
    public static void copyReverseArrays(int[] source, int[] target) {

        // Check if lengths are compatible
        if (source.length != target.length) {
            System.out.println("Error: Arrays are not compatible. Lengths must be equal.");
            return;
        }

        // Copy in reverse order
        for (int i = 0; i < source.length; i++) {
            target[i] = source[source.length - 1 - i];
        }

        System.out.println("Array copied successfully in reverse order.");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input source array size
        System.out.print("Enter size of source array: ");
        int size = input.nextInt();

        int[] source = new int[size];
        int[] target = new int[size];  // same size for compatibility

        // Input elements
        System.out.print("Enter " + size + " elements for source array:");
        for (int i = 0; i < size; i++) {
            source[i] = input.nextInt();
        }

        // Call method
        copyReverseArrays(source, target);

        // Display source array
        System.out.print("Source Array: ");
        for (int num : source) {
            System.out.print(num + " ");
        }

        // Display target array
        System.out.print("\nTarget Array (Reversed): ");
        for (int num : target) {
            System.out.print(num + " ");
        }


    }//main
}//class