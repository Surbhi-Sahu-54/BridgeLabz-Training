package com.encapsulationinterface.ridehailingapplication;

public class Auto extends Vehicle {

    public Auto(String vehicleId, String driverName) {
        super(vehicleId, driverName, 12); // ₹12 per km
    }

    @Override
    public double calculateFare(double distance) {
        return (distance * ratePerKm) + 20; // base charge
    }
}
