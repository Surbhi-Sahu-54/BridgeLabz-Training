package com.encapsulationinterface.librarymanagementsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B101", "Java Programming", "James Gosling"));
        items.add(new Magazine("M202", "Tech Today", "Editorial Team"));
        items.add(new DVD("D303", "Inception", "Christopher Nolan"));

        System.out.println("----- Library Management System -----");

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("Available: " + item.checkAvailability());
            item.reserveItem();
            System.out.println("------------------------------------");
        }
    }
}
