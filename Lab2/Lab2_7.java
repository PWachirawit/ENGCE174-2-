package Lab2;

import java.util.Scanner;

class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.printf("Balance: %.2f\n", balance);
    }
}

public class Lab2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Owner: ");
        String owner = scanner.nextLine();

        System.out.print("Balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Withdraw Amount 1: ");
        double withdraw1 = scanner.nextDouble();

        System.out.print("Withdraw Amount 2: ");
        double withdraw2 = scanner.nextDouble();

        BankAccount account = new BankAccount(owner, balance);

        account.withdraw(withdraw1);
        account.withdraw(withdraw2);

        account.displayBalance();

        scanner.close();
    }
}
