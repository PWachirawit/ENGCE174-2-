package Lab4;

import java.util.Scanner;

class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;

        if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 20) {
            this.fontSize = 20;
        } else {
            this.fontSize = fontSize;
        }

        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySettings() {
        System.out.println(
            "Theme: " + theme +
            ", Size: " + fontSize +
            ", Dark: " + darkMode
        );
    }
}

public class lab4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseTheme = scanner.nextLine();
        int baseFontSize = scanner.nextInt();
        boolean baseDark = scanner.nextBoolean();
        scanner.nextLine();

        String userTheme = scanner.nextLine();
        int userFontSize = scanner.nextInt();
        boolean userDark = scanner.nextBoolean();

        Configuration baseConfig =
            new Configuration(baseTheme, baseFontSize, baseDark);

        Configuration userConfig =
            new Configuration(userTheme, userFontSize, userDark);

        Configuration finalConfig =
            new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();

        scanner.close();
    }
}
