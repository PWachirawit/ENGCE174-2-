package Lab5;

import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {

    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class lab5_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stdId = scanner.nextLine();
        double stdBaseFee = scanner.nextDouble();
        scanner.nextLine();

        String preId = scanner.nextLine();
        double preBaseFee = scanner.nextDouble();
        double insuranceFee = scanner.nextDouble();

        Shipping standard = new StandardShipping(stdId, stdBaseFee);
        Shipping premium = new PremiumShipping(preId, preBaseFee, insuranceFee);

        Shipping[] shippings = { standard, premium };

        for (Shipping ship : shippings) {
            System.out.println(ship.calculateTotalFee());
        }

        scanner.close();
    }
}
