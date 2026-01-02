package com.encapsulationinterface.librarymanagementsystem;

public class DVD extends LibraryItem {

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3; // 3 days
    }
    public void reserveItem() {
        if (checkAvailability()) {
            setBorrower("Reserved User");
            System.out.println("DVD reserved successfully");
        } else {
            System.out.println("DVD already reserved");
        }
    }
}
