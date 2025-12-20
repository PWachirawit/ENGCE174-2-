package Lab4;

import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name) {
        this(name, 0.0);
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Product Name: " + name + ", Price: " + price);
    }
}

public class lab4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mode = scanner.nextInt();
        scanner.nextLine();

        Product product;

        if (mode == 1) {
            String name = scanner.nextLine();
            product = new Product(name);
        } else if (mode == 2) {
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            product = new Product(name, price);
        } else {
            scanner.close();
            return;
        }

        product.displayInfo();

        scanner.close();
    }
}
