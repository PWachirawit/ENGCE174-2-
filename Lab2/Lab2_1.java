package Lab2;

import java.util.Scanner;

// สร้างคลาส Student
class Student {
    private String studentid;
    private String name;

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

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
        student.setStudentid(studentid);
        student.setName(name);

        // แสดงผล
        System.out.println("Student ID: " + student.getStudentid());
        System.out.println("Name: " + student.getName());

        scanner.close();
    }
}