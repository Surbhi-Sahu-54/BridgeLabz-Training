package com.encapsulationinterface.vehiclerentalsystem;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
    public double calculateInsurance() {
        return rentalRate * 0.05; // 5% insurance
    }

    public String getInsuranceDetails() {
        return "Bike Insurance | Policy No: " + getInsurancePolicyNumber();
    }
}
