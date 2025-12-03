package Lab2;

import java.util.Scanner;

class Student {
    String name;
    int middleScore;
    int finalScore;

    public Student(String name, int middleScore, int finalScore) {
        this.name = name;
        this.middleScore = middleScore;
        this.finalScore = finalScore;
    }

    public double calculateAverage() {
        return (middleScore + finalScore) / 2.0;
    }

    public void displayInfo() {
        double avg = calculateAverage();
        System.out.println("name: " + name);
        System.out.println("Average: " + avg);

        if (avg >= 50.0) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");

        }
    }
}

public class Lab2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter middle score: ");
        int middleScore = scanner.nextInt();

        System.out.print("Enter final score: ");
        int finalScore = scanner.nextInt();

        Student student = new Student(name, middleScore, finalScore);

        student.displayInfo();
        scanner.close();
    }
}
