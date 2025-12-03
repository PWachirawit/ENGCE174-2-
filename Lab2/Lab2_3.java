package Lab2;

import java.util.Scanner;

class Student {
    String studentid;
    String name;

    static int studentCount = 0;

    public Student(String studentid, String name) {
        this.studentid = studentid;
        this.name = name;
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of student : ");
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= N; i++) {
            System.out.println("Student " + i + ":");

            System.out.print("Enter student ID: ");
            String studentid = scanner.nextLine();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            new Student(studentid, name);

        }

        System.out.println("Total number of students: " + Student.getStudentCount());
        scanner.close();
    }
}
