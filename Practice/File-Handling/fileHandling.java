import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling{
	public static void main(String[] args) throws IOException {
		// File Writer
		// FileWriter fw = new FileWriter("output1.docx");	
		// fw.write("OOP");
		// fw.write(65);
		// fw.write("PF");
		// fw.close();

		// File Reader
		FileReader fr = new FileReader("Input.txt");
		FileWriter fw = new FileWriter("Output.txt");
		Scanner s = new Scanner(fr);

		String result = "";
		while(s.hasNextLine()){
			result = s.nextLine();
		}

		System.out.println(result);
		fw.write(result);

		fw.close();
	}//main
}//class