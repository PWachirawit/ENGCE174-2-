package Lab2;

import java.util.Scanner;

class Student {
    String studentid;
    String name;

    void displayInfo() {
        System.out.println("Student ID: " + studentid);
        System.out.println("Name: " + name);
    }
}

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String studentid = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        Student student = new Student();

        student.studentid = studentid;
        student.name = name;

        student.displayInfo();

        System.out.println("Student ID: " + student.studentid);
        System.out.println("Name: " + student.name);

        scanner.close();
    }
}