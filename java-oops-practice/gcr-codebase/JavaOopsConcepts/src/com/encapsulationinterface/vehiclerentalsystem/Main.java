package com.encapsulationinterface.vehiclerentalsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-INS-001"));
        vehicles.add(new Bike("BIKE202", 800, "BIKE-INS-002"));
        vehicles.add(new Truck("TRUCK303", 5000, "TRUCK-INS-003"));

        int days = 3;

        System.out.println("----- Vehicle Rental System -----");

        for (Vehicle v : vehicles) {
            v.displayVehicle();
            System.out.println("Rental Cost (" + days + " days): ₹" + v.calculateRentalCost(days));
            System.out.println("Insurance Cost: ₹" + v.calculateInsurance());
            System.out.println(v.getInsuranceDetails());
            System.out.println("--------------------------------");
        }
    }
}
