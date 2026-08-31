import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryption {

    public static void main(String[] args) throws IOException {
        encryptFile("input.txt");
    }//main

    public static void encryptFile(String inputFile) throws IOException {

        FileReader fr = new FileReader(inputFile);
        FileWriter fw = new FileWriter("encrypted.txt");

        int ch;

        while ((ch = fr.read()) != -1){ //jb characters khtm ho jaye gy to -1 return hoga
            char c = (char) ch; //ascii value ki char mai conversion

            if(c >= 'a' && c <= 'y'){
                c = (char) (c + 1);
            } 

            else if(c == 'z'){
                c = 'a';
            } 

            else if(c >= 'A' && c <= 'Y'){
                c = (char) (c + 1);
            } 

            else if(c == 'Z'){
                c = 'A';
            }

            fw.write(c);

        }//while

        // Close files
        fr.close();
        fw.close();

        System.out.println("File encrypted successfully check \"encrypted.txt\"!");

    }//encryptFile

}//class