package com.objectmodeling.libraryandbooks;

public class Libraryandbook {
	 public static void main(String[] args) {

	        // Create independent Book objects
	        Book b1 = new Book("The Psychology of Money", "Morgan Housel");
	        Book b2 = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki");
	        Book b3 = new Book("Atomic Habits", "James Clear");

	        // Create Libraries
	        Library centralLibrary = new Library("Central Library");
	        Library collegeLibrary = new Library("College Library");

	        // Add books to libraries
	        centralLibrary.addBook(b1);
	        centralLibrary.addBook(b2);

	        collegeLibrary.addBook(b2);  // Same book in another library
	        collegeLibrary.addBook(b3);

	        // Display books
	        centralLibrary.showBooks();
	        collegeLibrary.showBooks();
	    }
}
