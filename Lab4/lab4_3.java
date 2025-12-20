package Lab4;

import java.util.Scanner;

class Player {
    private String username;
    private int level;

    public Player() {
        this.username = "guest";
        this.level = 1;
    }

    public Player(String username) {
        this.username = username;
        this.level = 1;
    }

    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayInfo() {
        System.out.println("user " + username + " level " + level);
    }
}

public class lab4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mode = scanner.nextInt();
        scanner.nextLine();

        Player player;

        if (mode == 1) {
            player = new Player();
        } else if (mode == 2) {
            String username = scanner.nextLine();
            int level = scanner.nextInt();
            player = new Player(username, level);
        } else {
            scanner.close();
            return;
        }

        player.displayInfo();
        scanner.close();
    }
}
