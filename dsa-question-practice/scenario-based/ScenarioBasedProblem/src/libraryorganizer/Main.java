package libraryorganizer;

public class Main {
	    public static void main(String[] args) {
	        Library lib = new Library();

	        Book b1 = new Book("Clean Code", "Robert Martin");
	        Book b2 = new Book("Effective Java", "Joshua Bloch");
	        Book b3 = new Book("Harry Potter", "J.K. Rowling");

	        lib.addBook("Programming", b1);
	        lib.addBook("Programming", b2);
	        lib.addBook("Fantasy", b3);

	        lib.displayCatalog();

	        lib.borrowBook("Programming", b1);
	        lib.displayCatalog();

	        lib.returnBook("Programming", b1);
	        lib.displayCatalog();
	    }
}
