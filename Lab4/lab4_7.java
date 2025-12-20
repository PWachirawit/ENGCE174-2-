package Lab4;

import java.util.Scanner;

class Resource {
    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Resource " + id + " finalized (destroyed).");
        super.finalize();
    }
}

public class lab4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id1 = scanner.nextLine();
        String id2 = scanner.nextLine();
        String id3 = scanner.nextLine();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null;
        r2 = null;

        System.gc();

        r3 = null;

        System.gc();

        scanner.close();
    }
}
