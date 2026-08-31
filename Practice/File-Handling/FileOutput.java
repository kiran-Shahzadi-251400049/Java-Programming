import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileOutput
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("output.txt");
        PrintWriter output = new PrintWriter(file);

        output.println("Kiran Shahzadi");
        output.println("Gift University");
        output.println("BS Software Engineering");

        output.close();

        System.out.println("Data written to output.txt");
    }//main
}//class


