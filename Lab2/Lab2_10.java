package Lab2;

import java.util.Scanner;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    Product[] products = new Product[10];
    int itemCount = 0;

    public void addProduct(Product Product) {
        if (itemCount < 10) {
            products[itemCount++] = Product;
        } else {
            System.out.println("Cart is full!");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += products[i].price;
        }
        return total;
    }
}

public class Lab2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        ShoppingCart cart = new ShoppingCart();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            scanner.nextLine();

            Product product = new Product(name, price);
            cart.addProduct(product);
        }

        double total = cart.calculateTotal();
        System.out.printf("Total Price: %.2f\n", total);

        scanner.close();
    }
}
