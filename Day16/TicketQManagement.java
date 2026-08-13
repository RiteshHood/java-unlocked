// the miniproject Ticket Queue Management system using the linkedList in java collection.
// Features: 
// 1. Add Customer
// 2. View Queue
// 3. Serve Next Customer
// 4. Search Customer
// 5. Remove Customer
// 6. Total Customers
// 7. Exit

import java.util.LinkedList;
import java.util.Scanner;

class Customer {

    static int customerId;
    String customerName;
    String customerIssue;
    String priority;

    Customer(int id, String name, String issue, String priority) {
        customerId = id;
        customerName = name;
        customerIssue = issue;
        this.priority = priority;

    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId
                + ", Name: " + customerName
                + ", Issue: " + customerIssue
                + ", Priority: " + priority;
    }

}

public class TicketQManagement {

    public static void main(String[] arg) {

        LinkedList<Customer> customers = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1: Add customer: ");
            System.out.println("2: View the Queue: ");
            System.out.println("3: Serve the customer: ");
            System.out.println("4: Search customer: ");
            System.out.println("5: Remove the Customer: ");
            System.out.println("6: Total customer: ");
            System.out.println("7: Exit: ");

            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    addCustomer(sc, customers);
                    break;
                case 2:
                    viewCustomers(customers);
                    break;
                case 3:
                    serveCustomer(customers);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }

    public static void addCustomer(Scanner sc, LinkedList<Customer> customers) {

        System.out.println("Enter customer Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter customer Name: ");
        String name = sc.nextLine();
        System.out.println("Enter customer Issue: ");
        String issue = sc.nextLine();
        System.out.println("Enter customer Priority");
        String priority = sc.nextLine();

        Customer newCustomer = new Customer(id, name, issue, priority);
        customers.addLast(newCustomer);

    }

    public static void viewCustomers(LinkedList<Customer> customers) {
        System.out.println(customers);
    }

    public static void serveCustomer(LinkedList<Customer> customers) {

        if (customers.isEmpty()) {
            System.out.println("The queue is empty !");
            return;
        }
        Thread serve = new Thread(() -> {
            try {
                Customer currentServingCustomer = customers.getFirst();
                System.out.println(
                        "Serving customer: \"" + currentServingCustomer + "\" .... wait for the result.."
                );
                Thread.sleep(4000);
                customers.removeFirst();
                System.out.println("The customer is served successfully!");

            } catch (InterruptedException e) {
                System.out.println("Serving process was interrupted.");
            }
        });
        serve.start();

    }
}
