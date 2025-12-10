package Lab3;

import java.util.Scanner;

class Product {
    private String name;
    private static int productCount = 0;

    public Product(String name) {
        this.name = name;
        productCount++;
    }

    public String getName() {
        return name;
    }

    public static int getProductCount() {
        return productCount;
    }
}

public class lab3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();

            new Product(productName);
        }

        System.out.println("Total products created: " + Product.getProductCount());

        scanner.close();
    }
}
