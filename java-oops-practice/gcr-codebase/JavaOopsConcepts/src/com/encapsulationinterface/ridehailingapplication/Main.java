package com.encapsulationinterface.ridehailingapplication;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> rides = new ArrayList<>();

        Vehicle v1 = new Car("CAR101", "Ramesh");
        Vehicle v2 = new Bike("BIKE202", "Suresh");
        Vehicle v3 = new Auto("AUTO303", "Mahesh");

        v1.updateLocation("City Center");
        v2.updateLocation("Railway Station");
        v3.updateLocation("Bus Stand");

        rides.add(v1);
        rides.add(v2);
        rides.add(v3);

        double distance = 10; // km

        System.out.println("----- Ride-Hailing Application -----");

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: ₹" + v.calculateFare(distance));
            System.out.println("----------------------------------");
        }
    }
}
