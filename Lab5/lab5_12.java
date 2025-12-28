package Lab5;

import java.util.Scanner;

class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

class BasicService extends Service {

    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

public class lab5_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String basicName = scanner.nextLine();
        double basicPrice = scanner.nextDouble();
        scanner.nextLine();


        String premiumName = scanner.nextLine();
        double premiumPrice = scanner.nextDouble();
        double premiumRate = scanner.nextDouble();

        Service basicService = new BasicService(basicName, basicPrice);
        Service premiumService =
                new PremiumService(premiumName, premiumPrice, premiumRate);


        Service[] services = { basicService, premiumService };


        int i = 0;
        while (i < services.length) {
            System.out.println(services[i].calculateFinalPrice());
            i++;
        }

        scanner.close();
    }
}

