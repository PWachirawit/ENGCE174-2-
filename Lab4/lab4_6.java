package Lab4;

import java.util.Scanner;

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point move(int dx, int dy) {
        int newX = this.x + dx;
        int newY = this.y + dy;
        return new Point(newX, newY);
    }

    public void displayInfo() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}

public class lab4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int dx = scanner.nextInt();
    int dy = scanner.nextInt();

    Point p1 = new Point(x, y);

    Point p2 = p1.move(dx, dy);

    Point p3 = p2.move(dx, dy);

    p1.displayInfo();
    p2.displayInfo();
    p3.displayInfo();

    scanner.close();
    }
}
