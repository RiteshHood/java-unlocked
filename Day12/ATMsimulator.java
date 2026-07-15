import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMsimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        while (true) {

            try {

                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Current Balance: ₹" + balance);
                        break;

                    case 2:

                        System.out.print("Enter deposit amount: ₹");
                        double deposit = sc.nextDouble();

                        if (deposit <= 0) {
                            throw new ArithmeticException("Deposit amount must be greater than 0.");
                        }

                        balance += deposit;
                        System.out.println("₹" + deposit + " deposited successfully.");
                        break;

                    case 3:

                        System.out.print("Enter withdrawal amount: ₹");
                        double withdraw = sc.nextDouble();

                        if (withdraw > balance) {
                            throw new ArithmeticException("Insufficient Balance!");
                        }

                        if (withdraw <= 0) {
                            throw new ArithmeticException("Withdrawal amount must be greater than 0.");
                        }

                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: ₹" + balance);
                        break;

                    case 4:

                        System.out.println("Thank you! Visit Again.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice!");

                }

            }

            catch (InputMismatchException e) {

                System.out.println("Please enter numbers only.");
                sc.nextLine();   // Clear invalid input

            }

            catch (ArithmeticException e) {

                System.out.println(e.getMessage());

            }

            finally {

                System.out.println("Thank you for using our ATM.");

            }

        }

    }

}