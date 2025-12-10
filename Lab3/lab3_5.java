package Lab3;

import java.util.Scanner;

class DatabaseConnection {
    private String connection;
    private boolean connected;

    public DatabaseConnection(String connection) {
        this.connection = connection;
        this.connected = false;
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void connect() {
        if (!this.connected) {
            this.connected = true;
            System.out.println("Connected to " + this.connection);
        } else {
            System.out.println("Already connected.");
        }
    }

    public void disconnect() {
        if (this.connected) {
            this.connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class lab3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String connectionString = scanner.nextLine();

        DatabaseConnection dbConnection = new DatabaseConnection(connectionString);

        dbConnection.connect();
        dbConnection.disconnect();
        dbConnection.disconnect();

        System.out.println(dbConnection.isConnected());

        scanner.close();
    }
}
