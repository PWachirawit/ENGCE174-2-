package Lab3;

import java.util.Scanner;

class InventoryItem {
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;

        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return this.productName;
    }

    public int getStock() {
        return this.stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount > 0 && amount <= this.stock) {
            this.stock -= amount;
            System.out.println("Sale successful.");
        } else if (amount > this.stock) {
            System.out.println("Not enough stock.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

public class lab3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();
        int initialStock = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine();

        InventoryItem item = new InventoryItem(productName, initialStock);

        for (int i = 0; i < N; i++) {
            String command = scanner.next();
            int amount = scanner.nextInt();

            if (command.equals("ADD")) {
                item.addStock(amount);
            } else if (command.equals("SELL")) {
                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + item.getStock());

        scanner.close();
    }
}
