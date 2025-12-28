package Lab5;

import java.util.Scanner;

class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

public class lab5_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String physicalName = scanner.nextLine();
        double unitPrice = scanner.nextDouble();
        int quantity = scanner.nextInt();
        scanner.nextLine();

        String digitalName = scanner.nextLine();
        double monthlyCost = scanner.nextDouble();
        int months = scanner.nextInt();

        Item physical = new PhysicalProduct(physicalName, unitPrice, quantity);
        Item digital = new DigitalSubscription(digitalName, monthlyCost, months);

        Item[] items = { physical, digital };

        double totalValue = 0.0;
        for (Item item : items) {
            totalValue += item.getValue();
        }

        System.out.println("Total Value: " + totalValue);

        scanner.close();
    }
}
