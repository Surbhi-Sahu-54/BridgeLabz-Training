package com.functionalinterfaces.markerinterfaces.cloningprototypeobjects;

public class PrototypeApp {

    public static void main(String[] args) {

        try {
            VehiclePrototype original =
                    new VehiclePrototype("Electric Car", 1200000);

            VehiclePrototype copy =
                    (VehiclePrototype) original.clone();

            System.out.println("Original: " + original);
            System.out.println("Cloned: " + copy);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }
    }
}
