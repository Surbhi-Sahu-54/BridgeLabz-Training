package com.smartcitytransport;

public interface TransportService {

    String getServiceName();
    double getFare();
    String getRoute();
    int getDepartureTime(); // minutes since day start

    default void printServiceDetails() {
        System.out.println(
            getServiceName() + " | Route: " + getRoute() +
            " | Fare: ₹" + getFare() +
            " | Departure: " + getDepartureTime()
        );
    }

}
