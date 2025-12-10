package Lab3;

import java.util.Scanner;

class Player {
    private int score;

    public Player(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

public class lab3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialScore = scanner.nextInt();

        int Score = scanner.nextInt();

        Player player = new Player(initialScore);

        player.setScore(Score);

        System.out.println(player.getScore());

        scanner.close();
    }

}