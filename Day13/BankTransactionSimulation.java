

class Account {

    private double balance = 10000;
    private String ownerName;

    public Account(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Please enter the valid amount.");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance !");
        } else if (amount <= 0) {
            System.out.println("Please enter the valid amount");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void getDetails() {
        System.out.println("Account Holder's Name : " + ownerName);
        System.out.println("Total Balance Available : " + balance);
    }
}

public class BankTransactionSimulation {

    public static void main(String[] args) {

        Account accnt1 = new Account("Ritesh Hood");

        Thread deposit = new Thread(() -> {
            try {
                int i=0;
                while(i<5){
                    accnt1.deposit(200);
                System.out.println("Current balance after deposit: " +accnt1.getBalance());
                Thread.sleep(800);
                i++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        Thread withdraw = new Thread(() -> {
            try {
                int i=0;
                while(i<5){
                    accnt1.withdraw(100);
                System.out.println("Current balance after withdraw : " +accnt1.getBalance());
                Thread.sleep(800);
                i++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        deposit.start();
        withdraw.start();




        

    }
}
