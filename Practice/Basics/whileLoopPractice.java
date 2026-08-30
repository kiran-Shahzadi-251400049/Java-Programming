import java.util.Scanner;
import java.util.Random;

public class whileLoopPractice
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice = -1;

        while (choice != 16) {

            System.out.println("\n========= WHILE LOOP PRACTICE MENU =========");
            System.out.println("1. Factorial");
            System.out.println("2. Multiplication Table");
            System.out.println("3. Squares from 1 to N");
            System.out.println("4. Voting Eligibility");
            System.out.println("5. Maximum of Two Numbers");
            System.out.println("6. Print Hello N Times");
            System.out.println("7. Smallest Digit");
            System.out.println("8. Count Digit Occurrence");
            System.out.println("9. Product of Digits");
            System.out.println("10. Sum of Even Digits");
            System.out.println("11. Reverse Number");
            System.out.println("12. Palindrome Check");
            System.out.println("13. Largest Digit");
            System.out.println("14. Guessing Game");
            System.out.println("15. Digit Frequency Counter");
            System.out.println("16. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // ======================================================
            // 1. FACTORIAL
            // ======================================================
            if (choice == 1) {
                System.out.print("Enter number: ");
                int num = input.nextInt();
                int fact = 1, i = 1;

                while (i <= num) {
                    fact *= i;
                    i++;
                }
                System.out.println("Factorial = " + fact);
            }

            // ======================================================
            // 2. MULTIPLICATION TABLE
            // ======================================================
            else if (choice == 2) {
                System.out.print("Enter number: ");
                int num = input.nextInt();
                int i = 1;

                while (i <= 10) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                    i++;
                }
            }

            // ======================================================
            // 3. SQUARES FROM 1 TO N
            // ======================================================
            else if (choice == 3) {
                System.out.print("Enter N: ");
                int n = input.nextInt();
                int i = 1;

                while (i <= n) {
                    System.out.println(i * i);
                    i++;
                }
            }

            // ======================================================
            // 4. VOTING ELIGIBILITY
            // ======================================================
            else if (choice == 4) {
                System.out.print("Enter age: ");
                int age = input.nextInt();

                if (age >= 18)
                    System.out.println("Eligible to vote");
                else
                    System.out.println("Not eligible");
            }

            // ======================================================
            // 5. MAXIMUM OF TWO NUMBERS
            // ======================================================
            else if (choice == 5) {
                System.out.print("Enter two numbers: ");
                int a = input.nextInt();
                int b = input.nextInt();

                if (a > b)
                    System.out.println("Greater number: " + a);
                else
                    System.out.println("Greater number: " + b);
            }

            // ======================================================
            // 6. PRINT HELLO N TIMES
            // ======================================================
            else if (choice == 6) {
                System.out.print("Enter N: ");
                int n = input.nextInt();
                int i = 1;

                while (i <= n) {
                    System.out.println("Hello");
                    i++;
                }
            }

            // ======================================================
            // 7. SMALLEST DIGIT
            // ======================================================
            else if (choice == 7) {
                System.out.print("Enter number: ");
                int num = input.nextInt();
                int smallest = 9;

                while (num > 0) {
                    int digit = num % 10;
                    if (digit < smallest)
                        smallest = digit;
                    num /= 10;
                }
                System.out.println("Smallest digit: " + smallest);
            }

            // ======================================================
            // 8. COUNT DIGIT OCCURRENCE
            // ======================================================
            else if (choice == 8) {
                System.out.print("Enter number: ");
                int num = input.nextInt();
                System.out.print("Enter digit to search: ");
                int search = input.nextInt();
                int count = 0;

                while (num > 0) {
                    if (num % 10 == search)
                        count++;
                    num /= 10;
                }
                System.out.println("Count: " + count);
            }

            // ======================================================
            // 9. PRODUCT OF DIGITS
            // ======================================================
            else if (choice == 9) {
                System.out.print("Enter number: ");
                int num = input.nextInt();
                int product = 1;

                while (num > 0) {
                    product *= (num % 10);
                    num /= 10;
                }
                System.out.println("Product: " + product);
            }

            // ======================================================
            // 10. SUM OF EVEN DIGITS
            // ======================================================
            else if (choice == 10) {
                System.out.print("Enter number: ");
                int num = input.nextInt();
                int sum = 0;

                while (num > 0) {
                    int digit = num % 10;
                    if (digit % 2 == 0)
                        sum += digit;
                    num /= 10;
                }
                System.out.println("Sum of even digits: " + sum);
            }

            // ======================================================
            // 11. REVERSE NUMBER
            // ======================================================
            else if (choice == 11) {
                System.out.print("Enter number: ");
                int num = input.nextInt();
                int reverse = 0;

                while (num > 0) {
                    reverse = reverse * 10 + (num % 10);
                    num /= 10;
                }
                System.out.println("Reverse: " + reverse);
            }

            // ======================================================
            // 12. PALINDROME CHECK
            // ======================================================
            else if (choice == 12) {
                System.out.print("Enter number: ");
                int num = input.nextInt();
                int original = num;
                int reverse = 0;

                while (num > 0) {
                    reverse = reverse * 10 + (num % 10);
                    num /= 10;
                }

                if (original == reverse)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
            }

            // ======================================================
            // 13. LARGEST DIGIT
            // ======================================================
            else if (choice == 13) {
                System.out.print("Enter number: ");
                int num = input.nextInt();
                int largest = 0;

                while (num > 0) {
                    int digit = num % 10;
                    if (digit > largest)
                        largest = digit;
                    num /= 10;
                }
                System.out.println("Largest digit: " + largest);
            }

            // ======================================================
            // 14. GUESSING GAME
            // ======================================================
            else if (choice == 14) {
                int number = rand.nextInt(100) + 1;
                int guess = 0;

                while (guess != number) {
                    System.out.print("Guess number (1-100): ");
                    guess = input.nextInt();

                    if (guess > number)
                        System.out.println("Too High!");
                    else if (guess < number)
                        System.out.println("Too Low!");
                    else
                        System.out.println("Correct!");
                }
            }

            // ======================================================
            // 15. DIGIT FREQUENCY COUNTER
            // ======================================================
            else if (choice == 15) {
                System.out.print("Enter number: ");
                int num = input.nextInt();
                int[] freq = new int[10];

                while (num > 0) {
                    freq[num % 10]++;
                    num /= 10;
                }

                int i = 0;
                while (i < 10) {
                    if (freq[i] > 0)
                        System.out.println(i + " : " + freq[i]);
                    i++;
                }
            }

            else if (choice == 16) {
                System.out.println("Program Ended.");
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

    }//main
}//class