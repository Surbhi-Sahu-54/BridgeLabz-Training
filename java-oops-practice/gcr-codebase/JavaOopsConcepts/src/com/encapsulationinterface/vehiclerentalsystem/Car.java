package com.encapsulationinterface.vehiclerentalsystem;

public class Car extends Vehicle {

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return rentalRate * 0.10; // 10% insurance
    }

    public String getInsuranceDetails() {
        return "Car Insurance | Policy No: " + getInsurancePolicyNumber();
    }
}
