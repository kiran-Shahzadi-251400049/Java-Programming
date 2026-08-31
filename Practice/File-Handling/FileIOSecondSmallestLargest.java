import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileIOSecondSmallestLargest
{
    static int getSecondSmallestNumber(int[] array)
    {
        int smallest = array[0];
        int secondSmallest = array[1];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < smallest)
            {
                secondSmallest = smallest;
                smallest = array[i];
            }
            else if (array[i] < secondSmallest && array[i] != smallest)
            {
                secondSmallest = array[i];
            }
        }

        return secondSmallest;
    }

    static int getSecondLargestNumber(int[] array)
    {
        int largest = array[0];
        int secondLargest = array[1];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > largest)
            {
                secondLargest = largest;
                largest = array[i];
            }
            else if (array[i] > secondLargest && array[i] != largest)
            {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("input-4.txt");
        Scanner input = new Scanner(file);

        int[] array = new int[6];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }

        input.close();

        int secondSmallest = getSecondSmallestNumber(array);
        int secondLargest = getSecondLargestNumber(array);

        PrintWriter output = new PrintWriter("output-4.txt");

        output.println("Second smallest number = " + secondSmallest);
        output.println("Second largest number = " + secondLargest);

        output.close();

        System.out.println("Result written to output-4.txt");
    }//main
}//class