package com.encapsulationinterface.ridehailingapplication;

public class Bike extends Vehicle {

    public Bike(String vehicleId, String driverName) {
        super(vehicleId, driverName, 8); // ₹8 per km
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
