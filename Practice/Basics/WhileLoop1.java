import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        double sum = 0;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            double number = input.nextDouble();
            sum += number;
            count++;
        }

        double average = sum / 10;
        System.out.println("Total = " + sum);
        System.out.println("Average = " + average);
    }//main
}//class
