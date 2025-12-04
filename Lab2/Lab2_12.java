package Lab2;

import java.util.Scanner;

class Course {
    String courseId;
    String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseinfo() {
        return courseId + ": " + courseName;
    }
}

class Student {
    String studentName;
    Course enrollCourse;

    public Student(String studentName, Course enrollCourse) {
        this.studentName = studentName;
        this.enrollCourse = enrollCourse;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrollCourse.getCourseinfo());
    }
}

public class Lab2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String courseId = scanner.nextLine();
        String courseName = scanner.nextLine();
        String studentName = scanner.nextLine();

        Course course = new Course(courseId, courseName);

        Student student = new Student(studentName, course);

        student.displayEnrollment();

        scanner.close();
    }
}
