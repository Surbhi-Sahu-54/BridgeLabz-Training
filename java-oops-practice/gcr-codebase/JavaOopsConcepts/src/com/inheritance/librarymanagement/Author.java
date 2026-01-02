package com.inheritance.librarymanagement;

class Author extends Book {
    private String name;
    private String bio;

    // Constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);   // calling Book constructor
        this.name = name;
        this.bio = bio;
    }
    
    void displayInfo() {
        super.displayInfo();   // show book details
        System.out.println("Author Name      : " + name);
        System.out.println("Author Bio       : " + bio);
    }
}
