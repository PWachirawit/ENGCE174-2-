package Lab4;

import java.util.Scanner;

class Subscription {
    private final String planName;
    private final int durationDays;
    private static int maxDuration = 365;

public Subscription(String planName, int durationDays) {
    this.planName = planName;

    if (durationDays < 0) {
        this.durationDays = 0;
    } else {
        this.durationDays = durationDays;
    }
}

    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + max);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {
    if (days <= 0) {
        System.out.println("Invalid extension days.");
        return this;
    }

    if (days > maxDuration) {
        System.out.println("Extension failed: Exceeds max policy.");
        return this;
    }

    System.out.println("Extension successful.");
    return new Subscription(this.planName, this.durationDays + days);
}


    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class lab4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();
        scanner.nextLine();
        Subscription.setMaxDuration(max);

        String plan = scanner.nextLine();
        int startDays = scanner.nextInt();
        scanner.nextLine();

        Subscription sub = new Subscription(plan, startDays);

        int d1 = scanner.nextInt();
        sub = sub.extend(d1);

        int d2 = scanner.nextInt();
        sub = sub.extend(d2);

        sub.displayInfo();
        scanner.close();
    }
}