package com.encapsulationinterface.librarymanagementsystem;

public class Book extends LibraryItem {

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() {
        return 14; // 14 days
    }
    public void reserveItem() {
        if (checkAvailability()) {
            setBorrower("Reserved User");
            System.out.println("Book reserved successfully");
        } else {
            System.out.println("Book already reserved");
        }
    }
}
