package Lab4;

import java.util.Scanner;

class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int r, int g, int b) {
        this.red = validate(r);
        this.green = validate(g);
        this.blue = validate(b);
    }

    private int validate(int value) {
        if (value < 0) return 0;
        if (value > 255) return 255;
        return value;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void displayRGB() {
        System.out.println("Color(R: " + red + ", G: " + green + ", B: " + blue + ")");
    }
}

public class lab4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();

        Color color = new Color(r, g, b);
        color.displayRGB();

        scanner.close();
    }  
}
