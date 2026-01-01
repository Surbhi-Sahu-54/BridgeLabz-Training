package com.objectmodeling.libraryandbooks;
import java.util.ArrayList;
public class Library {
	 private String libraryName;
	    private ArrayList<Book> books;   // Aggregation

	    // Constructor
	    public Library(String libraryName) {
	        this.libraryName = libraryName;
	        this.books = new ArrayList<>();
	    }

	    // Add book to library
	    public void addBook(Book book) {
	        books.add(book);
	    }

	    // Display books
	    public void showBooks() {
	        System.out.println("Library: " + libraryName);
	        for (Book book : books) {
	            System.out.println(book.getDetails());
	        }
	        System.out.println("-----------------------");
	    }
}
