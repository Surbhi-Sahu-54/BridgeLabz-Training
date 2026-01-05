package com.linkedlist.doublylinkedlist.moviemanagementsystem;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();
	        int choice;

	        do {
	            System.out.println("\n===== Movie Management System =====");
	            System.out.println("1. Add Movie at Beginning");
	            System.out.println("2. Add Movie at End");
	            System.out.println("3. Add Movie at Position");
	            System.out.println("4. Remove Movie by Title");
	            System.out.println("5. Search Movie by Director");
	            System.out.println("6. Search Movie by Rating");
	            System.out.println("7. Update Movie Rating");
	            System.out.println("8. Display Movies (Forward)");
	            System.out.println("9. Display Movies (Reverse)");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1, 2, 3 -> addMovie(sc, movies, choice);
	                case 4 -> {
	                    sc.nextLine();
	                    System.out.print("Enter Movie Title: ");
	                    movies.removeByTitle(sc.nextLine());
	                }
	                case 5 -> {
	                    sc.nextLine();
	                    System.out.print("Enter Director Name: ");
	                    movies.searchByDirector(sc.nextLine());
	                }
	                case 6 -> {
	                    System.out.print("Enter Rating: ");
	                    movies.searchByRating(sc.nextDouble());
	                }
	                case 7 -> {
	                    sc.nextLine();
	                    System.out.print("Enter Movie Title: ");
	                    String title = sc.nextLine();
	                    System.out.print("Enter New Rating: ");
	                    movies.updateRating(title, sc.nextDouble());
	                }
	                case 8 -> movies.displayForward();
	                case 9 -> movies.displayReverse();
	                case 0 -> System.out.println("Exiting...");
	                default -> System.out.println("Invalid choice");
	            }

	        } while (choice != 0);

	        sc.close();
	    }

	    private static void addMovie(Scanner sc, MovieDoublyLinkedList list, int type) {
	        sc.nextLine();
	        System.out.print("Movie Title: ");
	        String title = sc.nextLine();

	        System.out.print("Director: ");
	        String director = sc.nextLine();

	        System.out.print("Year of Release: ");
	        int year = sc.nextInt();

	        System.out.print("Rating: ");
	        double rating = sc.nextDouble();

	        if (type == 1)
	            list.addAtBeginning(title, director, year, rating);
	        else if (type == 2)
	            list.addAtEnd(title, director, year, rating);
	        else {
	            System.out.print("Position: ");
	            list.addAtPosition(sc.nextInt(), title, director, year, rating);
	        }
	    }
}
