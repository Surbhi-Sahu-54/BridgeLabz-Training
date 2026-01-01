package com.objectmodeling.libraryandbooks;

public class Book {
	 private String title;
	    private String author;

	    // Constructor
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    // Getter method
	    public String getDetails() {
	        return "Title: " + title + ", Author: " + author;
	    }
}
