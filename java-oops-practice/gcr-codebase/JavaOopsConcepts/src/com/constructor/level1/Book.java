package com.constructor.level1;
public class Book {
	
    String title;
    String author;
    double price;
 // Default constructor

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;

    }
    // Parameterized constructor
    Book(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;

    }

 void display() {

        System.out.println("Title: " + title);

        System.out.println("Author: " + author);

        System.out.println("Price: " + price);

    }
    
    public static void main(String[] args) {
          Book b1 = new Book();  
          b1.display();

       System.out.println();

      Book b2 = new Book("Java Basics", "James Gosling", 500.00);

        b2.display();

    }
}