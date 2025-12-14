package Lab3;

import java.util.Scanner;

class SystemConfig {
    private static SystemConfig instance;
    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        serverUrl = "default.server.com";
        maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public void setServerUrl(String url) {
        serverUrl = url;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public int getMaxConnections() {
        return maxConnections;
    }
}

public class lab3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int commandCount = 0;

        SystemConfig config = SystemConfig.getInstance();

        while (commandCount < N) {
            String line = scanner.nextLine().trim();
            line = line.replace("_", " ");

            if (line.equals("SET MAX")) {
                int value = Integer.parseInt(scanner.nextLine().trim());
                config.setMaxConnections(value);
                commandCount++;

            } else if (line.equals("SET URL")) {
                String url = scanner.nextLine().trim();
                config.setServerUrl(url);
                commandCount++;

            } else if (line.equals("SHOW")) {
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
                commandCount++;
            }
        }

        scanner.close();
    }
}
