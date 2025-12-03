package Lab2;

import java.util.Scanner;

class Student {
    String studentid;
    String name;
}

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String studentid = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        Student student = new Student();

        student.studentid = studentid;
        student.name = name;

        System.out.println("Student ID: " + student.studentid);
        System.out.println("Name: " + student.name);

        scanner.close();
    }
}
