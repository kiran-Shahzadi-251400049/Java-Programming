import java.util.Scanner;

public class Exponents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base number (>1): ");
        int base = input.nextInt();

        System.out.print("Enter exponent start value: ");
        int start = input.nextInt();

        System.out.print("Enter exponent end value: ");
        int end = input.nextInt();

        if (base <= 1 || start < 0 || end < 0 || start > end) {
            System.out.println("Invalid input. Please follow the rules.");
        } else {
            int exp = start;
            while (exp <= end) {
                int result = 1;
                int i = 1;

                while (i <= exp) {
                    result *= base;
                    i++;
                }

                System.out.println(base + " ^ " + exp + " = " + result);
                exp++;
            }
        }


    }
}
