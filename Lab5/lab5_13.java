package Lab5;

import java.util.Scanner;

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class lab5_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String devName = scanner.nextLine();
        int devProjects = scanner.nextInt();
        scanner.nextLine();

        String adminName = scanner.nextLine();
        int adminProjects = scanner.nextInt();
        scanner.nextLine();
        String adminKey = scanner.nextLine();

        User u1 = new User("Guest");
        User d1 = new Developer(devName, devProjects);
        User a1 = new Admin(adminName, adminProjects, adminKey);

        User[] users = { u1, d1, a1 };

        int totalClearance = 0;
        for (User user : users) {
            totalClearance += user.getClearanceLevel();
        }

        for (User user : users) {
            if (user instanceof Admin) {
                Admin admin = (Admin) user;
                System.out.println(admin.getAdminKey());
            }
        }

        System.out.println("TotalClearance: " + totalClearance);

        scanner.close();
    }
}
