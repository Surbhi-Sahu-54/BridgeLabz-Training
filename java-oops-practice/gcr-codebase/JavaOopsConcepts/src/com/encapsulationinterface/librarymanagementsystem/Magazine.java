package com.encapsulationinterface.librarymanagementsystem;

public class Magazine extends LibraryItem {

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            setBorrower("Reserved User");
            System.out.println("Magazine reserved successfully");
        } else {
            System.out.println("Magazine already reserved");
        }
    }
}
