// Payment Interface
interface Payment {

    void pay(double amount);

}

// Refundable Interface
interface Refundable {

    void refund(double amount);

}

// UPI Class
class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// CreditCard Class
class CreditCard implements Payment, Refundable {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card");
    }
}

// NetBanking Class
class NetBanking implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking");
    }
}

// Main Class
public class PaymentSystem {

    public static void main(String[] args) {

        // Using Payment reference (Polymorphism)
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new NetBanking();

        p1.pay(500);
        p2.pay(1500);
        p3.pay(2500);

        System.out.println();

        // Accessing Refundable functionality
        Refundable r = new CreditCard();
        r.refund(500);

    }
}