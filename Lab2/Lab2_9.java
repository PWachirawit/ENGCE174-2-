package Lab2;

import java.util.Scanner;

class Address {
    String street;
    String city;
    String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + zipCode;
    }
}

class Student {
    String name;
    int age;
    Address address;

    public Student(String name, int age, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}

public class Lab2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String street = scanner.nextLine();
        String city = scanner.nextLine();
        String zipCode = scanner.nextLine();

        Address address = new Address(street, city, zipCode);
        Student student = new Student(name, 20, address);

        student.displayInfo();

        scanner.close();
    }

}
