import java.util.Scanner;
public class Letter_Grade{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Grade: ");
        String st = s.nextLine().toUpperCase();
        // System.out.println(st);

        char letter = ' ';
        char sign = ' ';
        double grade = 0.0;

        if (st.length() == 1) {
            letter = st.charAt(0);
        }else if(st.length()==2){
            letter = st.charAt(0);
            sign = st.charAt(1);
        }

        // System.out.println(letter);
        // System.out.println(sign);

        if(letter == 'A'){
            grade = 4.0;
        }else if (letter == 'B') {
            grade = 3.0;
        }else if (letter == 'C') {
            grade = 2.0;
        }else if (letter == 'D') {
            grade = 1.0;
        }else{
            grade = 0.0;
        }

        

        if(sign == '+'){
            if (letter == 'A') {
                grade = 4.0;
            }else if (letter == 'F') {
                grade = 0.0;
            }else{
                grade = grade + 0.3; 
            }
        }else if (sign == '-') {
            if (letter == 'F') {
                grade = 0.0;
            }else{
                grade -= 0.3;
            }
        }

        System.out.println("Numeric Value of Grade: "+grade);
    }//main
}//class