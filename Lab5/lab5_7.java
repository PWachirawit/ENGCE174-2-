package Lab5;

import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    protected double commissionRate;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Manager extends Employee {
    protected double fixedBonus;

    public Manager(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Employee e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

public class lab5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String salesName = scanner.nextLine();
        double salesSalary = scanner.nextDouble();
        double rate = scanner.nextDouble();
        scanner.nextLine();

        String managerName = scanner.nextLine();
        double managerSalary = scanner.nextDouble();
        double bonus = scanner.nextDouble();

        Employee sales = new SalesEmployee(salesName, salesSalary, rate);
        Employee manager = new Manager(managerName, managerSalary, bonus);

        PayrollProcessor.process(sales);
        PayrollProcessor.process(manager);

        scanner.close();
    }
}
