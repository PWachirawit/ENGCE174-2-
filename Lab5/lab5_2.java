package Lab5;

import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class lab5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();

        Cat cat = new Cat();

        cat.name = name;
        cat.age = age;

        cat.displayInfo();

        cat.makeSound();

        scanner.close();
    }
}
