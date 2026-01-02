package com.encapsulationinterface.librarymanagementsystem;


public abstract class LibraryItem implements Reservable {

    private String itemId;
    private String title;
    private String author;

    // Encapsulated borrower details
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Encapsulation
    protected void setBorrower(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isAvailable = false;
    }

    protected String getBorrowerName() {
        return borrowerName;
    }

    protected void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    public boolean checkAvailability() {
        return isAvailable;
    }
}
