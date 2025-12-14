package Lab3;

import java.util.Scanner;

class User {
    private String username;
    private String password;
    private static int minPasswordLength = 8;

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
    }

    public User(String username, String password) {
        this.username = username;
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    public String getPassword() {
        return password;
    }
}

public class lab3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minLength1 = scanner.nextInt();
        scanner.nextLine();
        String user1_name = scanner.nextLine();
        String user1_password = scanner.nextLine();
        String user2_name = scanner.nextLine();
        String user2_password = scanner.nextLine();
        int minLength2 = scanner.nextInt();
        scanner.nextLine();
        String user2_newPass = scanner.nextLine();

        User.setMinLength(minLength1);

        User user1 = new User(user1_name, user1_password);
        User user2 = new User(user2_name, user2_password);

        User.setMinLength(minLength2);

        user2.setPassword(user2_newPass);

        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());

        scanner.close();
    }
}
