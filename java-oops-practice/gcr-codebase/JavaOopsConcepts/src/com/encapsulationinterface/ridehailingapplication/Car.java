package com.encapsulationinterface.ridehailingapplication;

public class Car extends Vehicle {

    public Car(String vehicleId, String driverName) {
        super(vehicleId, driverName, 15); // ₹15 per km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
