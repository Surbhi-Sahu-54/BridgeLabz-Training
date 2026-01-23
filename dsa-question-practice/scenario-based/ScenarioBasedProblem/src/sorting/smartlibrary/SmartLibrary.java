/*
 SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data
 */

package sorting.smartlibrary;
import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class SmartLibrary {
    ArrayList<Book> borrowedBooks = new ArrayList<>();

    void issueBook(String title, String author) {
        borrowedBooks.add(new Book(title, author));
        insertionSortByTitle();
        System.out.println("Book issued and sorted.");
    }

    void insertionSortByTitle() {
        for (int i = 1; i < borrowedBooks.size(); i++) {
            Book key = borrowedBooks.get(i);
            int j = i - 1;

            while (j >= 0 && borrowedBooks.get(j).title.compareToIgnoreCase(key.title) > 0) {
                borrowedBooks.set(j + 1, borrowedBooks.get(j));
                j--;
            }
            borrowedBooks.set(j + 1, key);
        }
    }

    void displayBorrowedBooks() {
        if (borrowedBooks.size() == 0) {
            System.out.println("No books borrowed.");
            return;
        }

        System.out.println("Borrowed Books (Sorted by Title):");
        for (int i = 0; i < borrowedBooks.size(); i++) {
            Book b = borrowedBooks.get(i);
            System.out.println((i + 1) + ". " + b.title + " - " + b.author);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartLibrary sl = new SmartLibrary();

        while (true) {
            System.out.println("\n1. Issue New Book");
            System.out.println("2. Display Borrowed Books");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                sl.issueBook(title, author);

            } else if (ch == 2) {
                sl.displayBorrowedBooks();

            } else if (ch == 3) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
