package Lab5;

import java.util.Scanner;

class Vehicle {
    protected String color;

    public Vehicle(String color) {
        this.color = color;
    }
}

class Car extends Vehicle {
    protected int wheels;

    public Car(String color, int wheels) {
        super(color);
        this.wheels = wheels;
    }

    public void displayDetails() {
        System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
}

public class lab5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String color = scanner.nextLine();
        int wheels = scanner.nextInt();

        Car car = new Car(color, wheels);

        car.displayDetails();

        scanner.close();
    }
}

