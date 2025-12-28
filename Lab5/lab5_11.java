package Lab5;

import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class lab5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textTitle1 = scanner.nextLine();
        int wordCount1 = scanner.nextInt();
        scanner.nextLine();

        String pdfTitle1 = scanner.nextLine();
        int pageCount1 = scanner.nextInt();
        scanner.nextLine();

        String textTitle2 = scanner.nextLine();
        int wordCount2 = scanner.nextInt();
        scanner.nextLine();

        String pdfTitle2 = scanner.nextLine();
        int pageCount2 = scanner.nextInt();

        Document doc1 = new TextDocument(textTitle1, wordCount1);
        Document doc2 = new PDFDocument(pdfTitle1, pageCount1);
        Document doc3 = new TextDocument(textTitle2, wordCount2);
        Document doc4 = new PDFDocument(pdfTitle2, pageCount2);

        Document[] documents = { doc1, doc2, doc3, doc4 };

        int totalPages = 0;
        for (Document doc : documents) {
            if (doc instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) doc;
                totalPages += pdf.pageCount;
            }
        }

        for (Document doc : documents) {
            doc.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);

        scanner.close();
    }
}
