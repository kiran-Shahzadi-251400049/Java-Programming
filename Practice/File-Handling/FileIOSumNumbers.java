import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileIOSumNumbers
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("input.txt");
        Scanner input = new Scanner(file);

        int sum = 0;

        while (input.hasNextInt())
        {
            int number = input.nextInt();
            sum = sum + number;
        }

        input.close();

        PrintWriter output = new PrintWriter("output-2.txt");

        output.println("Sum = " + sum);

        output.close();

        System.out.println("Sum written to output-2.txt");
    }//main
}//class