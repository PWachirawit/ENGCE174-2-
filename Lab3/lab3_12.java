package Lab3;

import java.util.Scanner;

class Employee {
    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class lab3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double monthlySalary = scanner.nextDouble();
        double taxRate = scanner.nextDouble();
        double raiseAmount = scanner.nextDouble();

        Employee emp = new Employee(name, monthlySalary);
        System.out.printf("Tax (Before): %.1f%n", emp.calculateTax(taxRate));

        emp.giveRaise(raiseAmount);

        System.out.printf("Tax (After): %.1f%n", emp.calculateTax(taxRate));

        scanner.close();
    }
}
