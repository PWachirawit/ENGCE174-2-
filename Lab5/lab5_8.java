package Lab5;

import java.util.Scanner;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getStatus() {
        return "Person: " + name;
    }
}

class Student extends Person {
    protected int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
    }
}

class Employee extends Person {
    protected double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus) {
        salary += bonus;
    }

    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class lab5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int studentId = scanner.nextInt();
        scanner.nextLine();


        String employeeName = scanner.nextLine();
        double salary = scanner.nextDouble();

        Person student = new Student(studentName, studentId);
        Person employee = new Employee(employeeName, salary);

        Person[] people = { student, employee };

        for (Person p : people) {
            if (p instanceof Employee) {
                Employee e = (Employee) p;
                e.applyBonus(1000.0);
            }
        }

        for (Person p : people) {
            System.out.println(p.getStatus());
        }

        scanner.close();
    }
}
