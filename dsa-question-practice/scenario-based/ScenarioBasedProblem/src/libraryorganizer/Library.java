package libraryorganizer;
import java.util.*;

public class Library {
	    HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
	    HashSet<Book> bookSet = new HashSet<>(); // Avoid duplicates

	    // Add Book
	    void addBook(String genre, Book book) {
	        if (bookSet.contains(book)) {
	            System.out.println("Duplicate book not allowed!");
	            return;
	        }

	        catalog.putIfAbsent(genre, new LinkedList<>());
	        catalog.get(genre).add(book);
	        bookSet.add(book);
	        System.out.println("Book added successfully.");
	    }

	    // Borrow Book
	    void borrowBook(String genre, Book book) {
	        if (!catalog.containsKey(genre)) {
	            System.out.println("Genre not found!");
	            return;
	        }

	        LinkedList<Book> books = catalog.get(genre);
	        if (books.remove(book)) {
	            bookSet.remove(book);
	            System.out.println("Book borrowed: " + book);
	        } else {
	            System.out.println("Book not available!");
	        }
	    }

	    // Return Book
	    void returnBook(String genre, Book book) {
	        addBook(genre, book);
	        System.out.println("Book returned.");
	    }

	    // Display Catalog
	    void displayCatalog() {
	        System.out.println("\nLibrary Catalog:");
	        for (String genre : catalog.keySet()) {
	            System.out.println("Genre: " + genre);
	            for (Book book : catalog.get(genre)) {
	                System.out.println("  - " + book);
	            }
	        }
	    }
}
