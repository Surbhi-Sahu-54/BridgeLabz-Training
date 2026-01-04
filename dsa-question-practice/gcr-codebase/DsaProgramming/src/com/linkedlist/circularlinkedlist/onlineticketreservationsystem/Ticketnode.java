package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;
public class Ticketnode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    Ticketnode next;

    public Ticketnode(int ticketId, String customerName, String movieName,
                      String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
