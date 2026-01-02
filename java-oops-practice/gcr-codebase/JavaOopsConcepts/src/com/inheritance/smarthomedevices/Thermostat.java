package com.inheritance.smarthomedevices;

class Thermostat extends Device {
    private int temperatureSetting;

    // Constructor
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);   // call Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        super.displayStatus();  // show device details
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}
