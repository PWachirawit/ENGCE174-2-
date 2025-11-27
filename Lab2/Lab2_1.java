package Lab2;

import java.util.Scanner;

// สร้างคลาส Student
class Student {
    String studentid;
    String name;
}

// main คลาส
public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับรหัสนักศึกษา
        System.out.print("Enter student ID: ");
        String studentid = scanner.nextLine();

        // รับชื่อ-สกุล
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        // ออพเจกต์ Student
        Student student = new Student();

        // กำหนด attribute
        student.studentid = studentid;
        student.name = name;

        // แสดงผล
        System.out.println("Student ID: " + student.studentid);
        System.out.println("Name: " + student.name);

        scanner.close();
    }
}