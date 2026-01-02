package com.inheritance.vehicleandtransportsystem;

class Motorcycle extends Vehicle {
    private boolean hasGear;

    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear : " + hasGear);
    }
}
