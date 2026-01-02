package com.encapsulationinterface.vehiclerentalsystem;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // extra load charge
    }

    public double calculateInsurance() {
        return rentalRate * 0.15; // 15% insurance
    }

    public String getInsuranceDetails() {
        return "Truck Insurance | Policy No: " + getInsurancePolicyNumber();
    }
}

