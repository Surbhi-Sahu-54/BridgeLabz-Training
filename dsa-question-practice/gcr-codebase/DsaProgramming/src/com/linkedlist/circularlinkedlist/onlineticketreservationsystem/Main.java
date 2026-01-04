package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Ticket ticketList = new Ticket();
	        int choice;

	        do {
	            System.out.println("\n===== Online Ticket Reservation =====");
	            System.out.println("1. Add Ticket");
	            System.out.println("2. Remove Ticket by ID");
	            System.out.println("3. Display All Tickets");
	            System.out.println("4. Search Ticket by Customer");
	            System.out.println("5. Search Ticket by Movie");
	            System.out.println("6. Count Total Tickets");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1 -> {
	                    System.out.print("Ticket ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Customer Name: ");
	                    String customer = sc.nextLine();

	                    System.out.print("Movie Name: ");
	                    String movie = sc.nextLine();

	                    System.out.print("Seat Number: ");
	                    String seat = sc.nextLine();

	                    System.out.print("Booking Time: ");
	                    String time = sc.nextLine();

	                    ticketList.addTicket(id, customer, movie, seat, time);
	                }
	                case 2 -> {
	                    System.out.print("Enter Ticket ID: ");
	                    ticketList.removeTicket(sc.nextInt());
	                }
	                case 3 -> ticketList.displayTickets();
	                case 4 -> {
	                    System.out.print("Customer Name: ");
	                    ticketList.searchByCustomer(sc.nextLine());
	                }
	                case 5 -> {
	                    System.out.print("Movie Name: ");
	                    ticketList.searchByMovie(sc.nextLine());
	                }
	                case 6 -> ticketList.countTickets();
	                case 0 -> System.out.println("Exiting...");
	                default -> System.out.println("Invalid choice");
	            }
	        } while (choice != 0);

	        sc.close();
	    }
}
