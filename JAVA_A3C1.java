import java.util.Scanner;

class InsufficientFundException extends Exception {
    InsufficientFundException(String message) {
        super(message);
    }
}

class SavingAccount {
    int acno;
    String name;
    double balance;

    SavingAccount(int acno, String name, double balance) {
        this.acno = acno;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) throws InsufficientFundException {
        if (balance - amount < 500) {
            throw new InsufficientFundException(
                    "Insufficient Funds! Minimum balance must be 500.");
        }

        balance = balance - amount;
        System.out.println("Amount withdrawn successfully.");
    }

    void viewbalance() {
        System.out.println("Account Number: " + acno);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class JAVA_A3C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount s = new SavingAccount(101, "Rahul", 2000);

        try {
            s.viewbalance();

            System.out.print("Enter deposit amount: ");
            double d = sc.nextDouble();
            s.deposit(d);

            System.out.print("Enter withdrawal amount: ");
            double w = sc.nextDouble();
            s.withdraw(w);

            s.viewbalance();

        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}