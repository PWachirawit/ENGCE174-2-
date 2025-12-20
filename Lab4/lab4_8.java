package Lab4;

import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title) {
        this(title, "Unknown", 0.0);
    }

    public Movie(String title, String director) {
        this(title, director, 0.0);
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;

        if (rating < 0.0) {
            this.rating = 0.0;
        } else if (rating > 10.0) {
            this.rating = 10.0;
        } else {
            this.rating = rating;
        }
    }
    
    public void displayDetails() {
        System.out.println("Title: " + title + ", Director: " + director + ", Rating: " + rating);
    }
}
public class lab4_8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mode = scanner.nextInt();
        scanner.nextLine();

        Movie movie;

        if (mode == 1) {
            String title = scanner.nextLine();
            movie = new Movie(title);
        } else if (mode == 2) {
            String title = scanner.nextLine();
            String director = scanner.nextLine();
            movie = new Movie(title, director);
        } else if (mode == 3) {
            String title = scanner.nextLine();
            String director = scanner.nextLine();
            double rating = scanner.nextDouble();
            movie = new Movie(title, director, rating);
        } else {
            scanner.close();
            return;
        }

        movie.displayDetails();
        scanner.close();
    }
}
