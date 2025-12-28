package Lab5;

import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {

    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {

    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class lab5_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carModel = scanner.nextLine();
        double carRate = scanner.nextDouble();
        scanner.nextLine();

        String bikeModel = scanner.nextLine();
        double bikeRate = scanner.nextDouble();

        RentalVehicle car = new Car(carModel, carRate);
        RentalVehicle motorcycle = new Motorcycle(bikeModel, bikeRate);

        RentalVehicle[] vehicles = { car, motorcycle };

        double totalFee = 0.0;
        for (RentalVehicle v : vehicles) {
            totalFee += v.calculateFee();
        }

        System.out.println("Total Rental Fee: " + totalFee);

        scanner.close();
    }
}

