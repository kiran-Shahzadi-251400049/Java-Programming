import java.util.Scanner;

public class FirstAndLastDigit
{

    public static void main(String[] args) 
   {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an Integer Num: ");
        int num = s.nextInt();

        int last = num % 10;
        System.out.println("Last Digit in Number  " + num + " is: " + last);

        int remain = (int) Math.log10(num);  
       //Math.log10(num)tells how many digits are after fist digit (int) convert it to integers

        int first = num / (int) Math.pow(10, remain);  
        /*Math.pow(10, remain) 10^number of digits after first digit (int) changes to integer
        num / (int) Math.pow(10, remain) as a whole dives given number with 10^no of digits after first digit*/

        System.out.println("First Digit in Number  " + num + " is: " + first);

    }

}
