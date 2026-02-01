package com.functionalinterfaces.markerinterfaces.cloningprototypeobjects;

class VehiclePrototype implements Cloneable {

    String model;
    int price;

    VehiclePrototype(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    @Override
    public String toString() {
        return model + " - ₹" + price;
    }
}
