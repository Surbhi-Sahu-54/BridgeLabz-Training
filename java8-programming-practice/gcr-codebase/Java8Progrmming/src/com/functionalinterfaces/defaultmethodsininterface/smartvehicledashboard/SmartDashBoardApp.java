package com.functionalinterfaces.defaultmethodsininterface.smartvehicledashboard;
public class SmartDashBoardApp {

    public static void main(String[] args) {

        VehicleDashboard petrol = new PetrolCar();
        VehicleDashboard electric = new ElectricCar();

        petrol.displaySpeed(80);
        petrol.displayBattery(0);   // default

        electric.displaySpeed(100);
        electric.displayBattery(75); // overridden
    }
}
