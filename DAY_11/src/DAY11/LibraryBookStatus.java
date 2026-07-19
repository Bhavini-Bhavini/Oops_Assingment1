package DAY11;
import java.util.Scanner;

class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void issueBook() {
        if (isIssued) {
            System.out.println("Error: Book is already issued.");
        } else {
            isIssued = true;
            System.out.println("Book issued successfully.");
            displayBook();
        }
    }

    public void returnBook() {
        if (!isIssued) {
            System.out.println("Error: Book is already available.");
        } else {
            isIssued = false;
            System.out.println("Book returned successfully.");
            displayBook();
        }
    }

    public void displayBook() {
        System.out.println("Book Status: " + (isIssued ? "Issued" : "Available"));
    }
}

public class LibraryBookStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        Book book = new Book(id, title, author);

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Issue Book");
            System.out.println("2. Return Book");
            System.out.println("3. Display Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    book.issueBook();
                    break;
                case 2:
                    book.returnBook();
                    break;
                case 3:
                    book.displayBook();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
