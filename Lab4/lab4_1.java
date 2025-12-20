package Lab4;

import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class lab4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mode = scanner.nextInt();
        scanner.nextLine();

        Book book;

        if (mode == 1) {
            String title = scanner .nextLine();
            book = new Book(title);
        } else  if (mode == 2) {
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            book = new Book(title, author);
        } else {
            return;
        }

        book.displayInfo();

        scanner.close();
    }
}
