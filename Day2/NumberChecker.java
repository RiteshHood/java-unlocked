import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Even or Odd
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // Prime check
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}