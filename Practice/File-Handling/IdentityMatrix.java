import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class IdentityMatrix
{
    static int[][] toIdentityMatrix(int size)
    {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (i == j)
                {
                    matrix[i][j] = 1;
                }
                else
                {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("input-6.txt");
        Scanner input = new Scanner(file);

        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                array[i][j] = input.nextInt();
            }
        }

        input.close();

        int[][] identity = toIdentityMatrix(rows);

        PrintWriter output = new PrintWriter("output-6.txt");

        for (int i = 0; i < identity.length; i++)
        {
            for (int j = 0; j < identity[i].length; j++)
            {
                output.print(identity[i][j] + " ");
            }

            output.println();
        }

        output.close();

        System.out.println("Identity matrix written to output-6.txt");
    }//main
}//class