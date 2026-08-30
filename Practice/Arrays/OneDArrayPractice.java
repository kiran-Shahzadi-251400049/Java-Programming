import java.util.Scanner;

public class OneDArrayPractice
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 21) {

            System.out.println("\n====== 1D ARRAY PRACTICE MENU ======");
            System.out.println("1. Sum of Elements");
            System.out.println("2. Max and Min");
            System.out.println("3. Count Even and Odd");
            System.out.println("4. Reverse Array");
            System.out.println("5. Search Key");
            System.out.println("6. Second Largest");
            System.out.println("7. Print Duplicates");
            System.out.println("8. Print Non-Duplicates");
            System.out.println("9. Left Shift");
            System.out.println("10. Right Shift");
            System.out.println("11. Bubble Sort (Ascending)");
            System.out.println("12. Sort Descending");
            System.out.println("13. Frequency Count");
            System.out.println("14. Most Occurring Element");
            System.out.println("15. Replace Negative with Zero");
            System.out.println("16. Merge Two Sorted Arrays");
            System.out.println("17. Find Missing Number (1 to N)");
            System.out.println("18. Common Elements");
            System.out.println("19. Unique Elements from Both Arrays");
            System.out.println("20. Pairs with Sum K");
            System.out.println("21. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            if (choice >= 1 && choice <= 15 || choice == 20) {

                System.out.print("Enter size of array: ");
                int n = input.nextInt();
                int[] arr = new int[n];

                System.out.println("Enter elements:");
                for (int i = 0; i < n; i++)
                    arr[i] = input.nextInt();

                // ==========================================
                // 1. SUM OF ELEMENTS
                // ==========================================
                if (choice == 1) {
                    int sum = 0;
                    for (int i = 0; i < n; i++)
                        sum += arr[i];
                    System.out.println("Sum = " + sum);
                }

                // ==========================================
                // 2. MAX AND MIN
                // ==========================================
                else if (choice == 2) {
                    int max = arr[0], min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) max = arr[i];
                        if (arr[i] < min) min = arr[i];
                    }
                    System.out.println("Max = " + max);
                    System.out.println("Min = " + min);
                }

                // ==========================================
                // 3. COUNT EVEN AND ODD
                // ==========================================
                else if (choice == 3) {
                    int even = 0, odd = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0) even++;
                        else odd++;
                    }
                    System.out.println("Even: " + even);
                    System.out.println("Odd: " + odd);
                }

                // ==========================================
                // 4. REVERSE ARRAY
                // ==========================================
                else if (choice == 4) {
                    for (int i = n - 1; i >= 0; i--)
                        System.out.print(arr[i] + " ");
                }

                // ==========================================
                // 5. SEARCH KEY
                // ==========================================
                else if (choice == 5) {
                    System.out.print("Enter key: ");
                    int key = input.nextInt();
                    int index = -1;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            index = i;
                            break;
                        }
                    }

                    if (index != -1)
                        System.out.println("Found at index " + index);
                    else
                        System.out.println("Not Found");
                }

                // ==========================================
                // 6. SECOND LARGEST
                // ==========================================
                else if (choice == 6) {
                    int largest = Integer.MIN_VALUE;
                    int second = Integer.MIN_VALUE;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] > largest) {
                            second = largest;
                            largest = arr[i];
                        } else if (arr[i] > second && arr[i] != largest) {
                            second = arr[i];
                        }
                    }
                    System.out.println("Second Largest = " + second);
                }

                // ==========================================
                // 7. PRINT DUPLICATES
                // ==========================================
                else if (choice == 7) {
                    for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (arr[i] == arr[j]) {
                                System.out.println(arr[i]);
                                break;
                            }
                        }
                    }
                }

                // ==========================================
                // 8. PRINT NON-DUPLICATES
                // ==========================================
                else if (choice == 8) {
                    for (int i = 0; i < n; i++) {
                        int count = 0;
                        for (int j = 0; j < n; j++) {
                            if (arr[i] == arr[j])
                                count++;
                        }
                        if (count == 1)
                            System.out.println(arr[i]);
                    }
                }

                // ==========================================
                // 9. LEFT SHIFT
                // ==========================================
                else if (choice == 9) {
                    int first = arr[0];
                    for (int i = 0; i < n - 1; i++)
                        arr[i] = arr[i + 1];
                    arr[n - 1] = first;

                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                }

                // ==========================================
                // 10. RIGHT SHIFT
                // ==========================================
                else if (choice == 10) {
                    int last = arr[n - 1];
                    for (int i = n - 1; i > 0; i--)
                        arr[i] = arr[i - 1];
                    arr[0] = last;

                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                }

                // ==========================================
                // 11. BUBBLE SORT ASCENDING
                // ==========================================
                else if (choice == 11) {
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - 1 - i; j++) {
                            if (arr[j] > arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                }

                // ==========================================
                // 12. SORT DESCENDING
                // ==========================================
                else if (choice == 12) {
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (arr[i] < arr[j]) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                }

                // ==========================================
                // 13. FREQUENCY COUNT
                // ==========================================
                else if (choice == 13) {
                    for (int i = 0; i < n; i++) {
                        int count = 1;
                        if (arr[i] == -9999) continue;

                        for (int j = i + 1; j < n; j++) {
                            if (arr[i] == arr[j]) {
                                count++;
                                arr[j] = -9999;
                            }
                        }
                        System.out.println(arr[i] + " : " + count);
                    }
                }

                // ==========================================
                // 14. MOST OCCURRING ELEMENT
                // ==========================================
                else if (choice == 14) {
                    int maxCount = 0, most = arr[0];

                    for (int i = 0; i < n; i++) {
                        int count = 0;
                        for (int j = 0; j < n; j++) {
                            if (arr[i] == arr[j])
                                count++;
                        }
                        if (count > maxCount) {
                            maxCount = count;
                            most = arr[i];
                        }
                    }
                    System.out.println("Most Occurring = " + most);
                }

                // ==========================================
                // 15. REPLACE NEGATIVE WITH ZERO
                // ==========================================
                else if (choice == 15) {
                    for (int i = 0; i < n; i++) {
                        if (arr[i] < 0)
                            arr[i] = 0;
                    }
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                }

                // ==========================================
                // 20. PAIRS WITH SUM K
                // ==========================================
                else if (choice == 20) {
                    System.out.print("Enter K: ");
                    int k = input.nextInt();

                    for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (arr[i] + arr[j] == k)
                                System.out.println(arr[i] + " + " + arr[j]);
                        }
                    }
                }
            }

            // ==========================================
            // 16,17,18,19 REQUIRE TWO ARRAYS
            // ==========================================
            else if (choice >= 16 && choice <= 19) {

                System.out.print("Enter size of first array: ");
                int n1 = input.nextInt();
                int[] a = new int[n1];

                System.out.println("Enter elements:");
                for (int i = 0; i < n1; i++)
                    a[i] = input.nextInt();

                System.out.print("Enter size of second array: ");
                int n2 = input.nextInt();
                int[] b = new int[n2];

                System.out.println("Enter elements:");
                for (int i = 0; i < n2; i++)
                    b[i] = input.nextInt();

                // 16. MERGE SORTED ARRAYS
                if (choice == 16) {
                    int[] merge = new int[n1 + n2];
                    int i = 0, j = 0, k = 0;

                    while (i < n1 && j < n2) {
                        if (a[i] < b[j])
                            merge[k++] = a[i++];
                        else
                            merge[k++] = b[j++];
                    }
                    while (i < n1) merge[k++] = a[i++];
                    while (j < n2) merge[k++] = b[j++];

                    for (int x = 0; x < merge.length; x++)
                        System.out.print(merge[x] + " ");
                }

                // 17. MISSING NUMBER
                else if (choice == 17) {
                    int sum = 0;
                    for (int i = 0; i < n1; i++)
                        sum += a[i];

                    int N = n1 + 1;
                    int total = N * (N + 1) / 2;
                    System.out.println("Missing number = " + (total - sum));
                }

                // 18. COMMON ELEMENTS
                else if (choice == 18) {
                    for (int i = 0; i < n1; i++) {
                        for (int j = 0; j < n2; j++) {
                            if (a[i] == b[j])
                                System.out.println(a[i]);
                        }
                    }
                }

                // 19. UNIQUE FROM BOTH
                else if (choice == 19) {
                    for (int i = 0; i < n1; i++)
                        System.out.println(a[i]);
                    for (int j = 0; j < n2; j++)
                        System.out.println(b[j]);
                }
            }

            else if (choice == 21) {
                System.out.println("Program Ended.");
            }

            else {
                System.out.println("Invalid choice!");
            }
        }


    }//main
}//class