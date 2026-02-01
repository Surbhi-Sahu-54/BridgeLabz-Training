package com.functionalinterfaces.staticmethodsininterface.unitconversiontool;

public interface UnitConverter {

    // km → miles
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // miles → km
    static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    // kg → lbs
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    // lbs → kg
    static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}
