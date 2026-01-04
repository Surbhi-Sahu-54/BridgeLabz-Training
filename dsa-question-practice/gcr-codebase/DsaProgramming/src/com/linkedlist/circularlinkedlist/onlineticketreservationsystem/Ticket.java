package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class Ticket {
	    private Ticketnode head;
	    private Ticketnode tail;

	    // Add ticket at end
	    public void addTicket(int id, String customer, String movie,
	                          String seat, String time) {

	        Ticketnode newNode = new Ticketnode(id, customer, movie, seat, time);

	        if (head == null) {
	            head = tail = newNode;
	            newNode.next = newNode; // circular
	            return;
	        }

	        tail.next = newNode;
	        newNode.next = head;
	        tail = newNode;
	    }

	    // Remove ticket by ID
	    public void removeTicket(int id) {
	        if (head == null) {
	            System.out.println("No tickets booked");
	            return;
	        }

	        // Single node
	        if (head == tail && head.ticketId == id) {
	            head = tail = null;
	            return;
	        }

	        // Remove head
	        if (head.ticketId == id) {
	            head = head.next;
	            tail.next = head;
	            return;
	        }

	        Ticketnode temp = head;
	        while (temp.next != head && temp.next.ticketId != id) {
	            temp = temp.next;
	        }

	        if (temp.next == head) {
	            System.out.println("Ticket not found");
	            return;
	        }

	        if (temp.next == tail) {
	            tail = temp;
	        }

	        temp.next = temp.next.next;
	    }

	    // Display all tickets
	    public void displayTickets() {
	        if (head == null) {
	            System.out.println("No tickets booked");
	            return;
	        }

	        Ticketnode temp = head;
	        do {
	            display(temp);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    // Search by customer name
	    public void searchByCustomer(String name) {
	        if (head == null) {
	            System.out.println("No tickets booked");
	            return;
	        }

	        Ticketnode temp = head;
	        boolean found = false;

	        do {
	            if (temp.customerName.equalsIgnoreCase(name)) {
	                display(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        if (!found)
	            System.out.println("No ticket found for this customer");
	    }

	    // Search by movie name
	    public void searchByMovie(String movie) {
	        if (head == null) {
	            System.out.println("No tickets booked");
	            return;
	        }

	        Ticketnode temp = head;
	        boolean found = false;

	        do {
	            if (temp.movieName.equalsIgnoreCase(movie)) {
	                display(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        if (!found)
	            System.out.println("No ticket found for this movie");
	    }

	    // Count total tickets
	    public void countTickets() {
	        if (head == null) {
	            System.out.println("Total Tickets: 0");
	            return;
	        }

	        int count = 0;
	        Ticketnode temp = head;
	        do {
	            count++;
	            temp = temp.next;
	        } while (temp != head);

	        System.out.println("Total Tickets: " + count);
	    }

	    // Helper method
	    private void display(Ticketnode t) {
	        System.out.println(
	            "ID: " + t.ticketId +
	            ", Customer: " + t.customerName +
	            ", Movie: " + t.movieName +
	            ", Seat: " + t.seatNumber +
	            ", Time: " + t.bookingTime
	        );
	    }
}
