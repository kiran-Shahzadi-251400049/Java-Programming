import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileIOFirstRepeatingNumber
{
    static int getFirstRepeatingNumber(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] == array[j])
                {
                    return array[i];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("input-3.txt");
        Scanner input = new Scanner(file);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }

        input.close();

        int result = getFirstRepeatingNumber(array);

        PrintWriter output = new PrintWriter("output-3.txt");

        if (result == -1)
        {
            output.println("All elements are unique");
        }
        else
        {
            output.println("First repeating number = " + result);
        }

        output.close();

        System.out.println("Result written to output-3.txt");
    }//main
}//class