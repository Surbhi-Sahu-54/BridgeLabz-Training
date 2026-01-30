package com.functionalinterfaces.defaultmethodsininterface.smartvehicledashboard;

class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

    @Override
    public void displayBattery(int percent) {
        System.out.println("Battery Level: " + percent + "%");
    }
}
