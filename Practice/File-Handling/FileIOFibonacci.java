import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileIOFibonacci
{
    static boolean isFibonacci(int[] array)
    {
        for (int i = 2; i < array.length; i++)
        {
            if (array[i] != array[i - 1] + array[i - 2])
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("input-5.txt");
        Scanner input = new Scanner(file);

        int[] array = new int[13];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }

        input.close();

        boolean result = isFibonacci(array);

        PrintWriter output = new PrintWriter("output-5.txt");

        if (result)
        {
            output.println("The array is a Fibonacci series.");
        }
        else
        {
            output.println("The array is not a Fibonacci series.");
        }

        output.close();

        System.out.println("Result written to output-5.txt");
    }//main
}//class