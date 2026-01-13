package libraryorganizer;

public class Book {
	    String title;
	    String author;

	    Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    // Override equals & hashCode to avoid duplicates
	    @Override
	    public boolean equals(Object obj) {
	        Book b = (Book) obj;
	        return title.equalsIgnoreCase(b.title) &&
	               author.equalsIgnoreCase(b.author);
	    }

	    @Override
	    public int hashCode() {
	        return title.toLowerCase().hashCode() +
	               author.toLowerCase().hashCode();
	    }

	    @Override
	    public String toString() {
	        return title + " by " + author;
	    }
	}

