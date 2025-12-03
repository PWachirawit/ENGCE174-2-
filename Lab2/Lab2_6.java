package Lab2;

import java.util.Scanner;

class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void displaySummary() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
}

public class Lab2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Owner: ");
        String owner = scanner.nextLine();

        System.out.print("Balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Deposit Amount: ");
        double depositAmount = scanner.nextDouble();

        BankAccount account = new BankAccount(owner, balance);

        account.deposit(depositAmount);

        account.displaySummary();

        scanner.close();
    }
}
