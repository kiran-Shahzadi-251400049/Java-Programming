import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a) Average of odd numbers between a and b
        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        int sum = 0, count = 0;
        int i = a;

        while (i <= b) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
            i++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of odd numbers: " + average);
        } else {
            System.out.println("No odd numbers found.");
        }

        // b) Print sequence: 25, 21, 17, 13, 9, 5
        System.out.print("Sequence: ");
        int num = 25;
        while (num > 2) {
            System.out.print(num + " ");
            num -= 4;
        }

        
    }//main
}//class
