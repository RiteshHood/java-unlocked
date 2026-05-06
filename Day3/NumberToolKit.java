
import java.util.Scanner;

public class NumberToolKit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== NUMBER TOOLKIT ===");
            System.out.println("1. Factorial");
            System.out.println("2. Reverse Number");
            System.out.println("3. Palindrome Check");
            System.out.println("4. Print Pattern");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                // Factorial
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                int fact = 1;

                for (int i = 1; i <= n; i++) {
                    fact *= i;
                }

                System.out.println("Factorial = " + fact);

            } else if (choice == 2) {
                // Reverse Number
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                int rev = 0;

                while (num != 0) {
                    int digit = num % 10;
                    rev = rev * 10 + digit;
                    num /= 10;
                }

                System.out.println("Reversed = " + rev);

            } else if (choice == 3) {
                // Palindrome
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                int original = num;
                int rev = 0;

                while (num != 0) {
                    int digit = num % 10;
                    rev = rev * 10 + digit;
                    num /= 10;
                }

                if (original == rev) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not Palindrome");
                }

            } else if (choice == 4) {
                // Pattern
                System.out.print("Enter rows: ");
                int rows = sc.nextInt();

                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
