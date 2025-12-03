package Lab2;

import java.util.Scanner;

class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Lab2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        scanner.close();
    }
}