package Lab3;

import java.util.Scanner;

class BankAccount {
    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit) {
        if (initialDeposit >= 0) {
            balance = initialDeposit;
        } else {
            balance = 0;
        }
        System.out.println("Account created.");
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        }
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class lab3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount myAccount = null;

        int N = scanner.nextInt();
        scanner.nextLine();

        int count = 0;
        while (count < N) {
            String command = scanner.nextLine();

            if (command.equals("CREATE")) {
                double initial = scanner.nextDouble();
                scanner.nextLine();
                myAccount = new BankAccount(initial);
            } else if (command.equals("DEPOSIT")) {
                double amount = scanner.nextDouble();
                scanner.nextLine();
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.deposit(amount);
                }
            } else if (command.equals("WITHDRAW")) {
                double amount = scanner.nextDouble();
                scanner.nextLine();
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.withdraw(amount);
                }
            } else if (command.equals("STATUS")) {
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Balance: " + myAccount.getBalance());
                }
            } else if (command.equals("GLOBAL_STATUS")) {
                System.out.println(
                        "Total Transactions: " +
                                BankAccount.getTotalTransactionCount());
            }

            count++;
        }

        scanner.close();
    }
}
