package Lab3;

import java.util.Scanner;

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class lab3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        User user = new User(username);

        System.out.println(user.getUsername());

        scanner.close();
    }
}