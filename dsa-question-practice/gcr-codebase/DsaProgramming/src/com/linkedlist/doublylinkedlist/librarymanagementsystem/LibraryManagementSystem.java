package com.linkedlist.doublylinkedlist.librarymanagementsystem;
import java.util.Scanner;

public class LibraryManagementSystem {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();
	        int choice;

	        do {
	            System.out.println("\n===== Library Management System =====");
	            System.out.println("1. Add Book at Beginning");
	            System.out.println("2. Add Book at End");
	            System.out.println("3. Add Book at Position");
	            System.out.println("4. Remove Book by ID");
	            System.out.println("5. Search Book by Title");
	            System.out.println("6. Search Book by Author");
	            System.out.println("7. Update Availability Status");
	            System.out.println("8. Display Books (Forward)");
	            System.out.println("9. Display Books (Reverse)");
	            System.out.println("10. Count Total Books");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1, 2, 3 -> addBook(sc, library, choice);
	                case 4 -> {
	                    System.out.print("Enter Book ID: ");
	                    library.removeByBookId(sc.nextInt());
	                }
	                case 5 -> {
	                    sc.nextLine();
	                    System.out.print("Enter Book Title: ");
	                    library.searchByTitle(sc.nextLine());
	                }
	                case 6 -> {
	                    sc.nextLine();
	                    System.out.print("Enter Author Name: ");
	                    library.searchByAuthor(sc.nextLine());
	                }
	                case 7 -> {
	                    System.out.print("Enter Book ID: ");
	                    int id = sc.nextInt();
	                    System.out.print("Available? (true/false): ");
	                    library.updateAvailability(id, sc.nextBoolean());
	                }
	                case 8 -> library.displayForward();
	                case 9 -> library.displayReverse();
	                case 10 -> library.countBooks();
	                case 0 -> System.out.println("Exiting...");
	                default -> System.out.println("Invalid choice");
	            }
	        } while (choice != 0);

	        sc.close();
	    }

	    private static void addBook(Scanner sc, LibraryDoublyLinkedList list, int type) {
	        System.out.print("Book ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Title: ");
	        String title = sc.nextLine();

	        System.out.print("Author: ");
	        String author = sc.nextLine();

	        System.out.print("Genre: ");
	        String genre = sc.nextLine();

	        System.out.print("Available (true/false): ");
	        boolean available = sc.nextBoolean();

	        if (type == 1)
	            list.addAtBeginning(id, title, author, genre, available);
	        else if (type == 2)
	            list.addAtEnd(id, title, author, genre, available);
	        else {
	            System.out.print("Position: ");
	            list.addAtPosition(sc.nextInt(), id, title, author, genre, available);
	        }
	    }
	}
