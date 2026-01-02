package com.inheritance.vehicleandtransportsystem;

class Truck extends Vehicle {
    private double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity : " + loadCapacity + " tons");
    }
}
