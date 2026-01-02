package com.inheritance.smarthomedevices;

public class Main {
    public static void main(String[] args) {

        Thermostat t1 = new Thermostat("TH101", "ON", 24);
        t1.displayStatus();
    }
}
