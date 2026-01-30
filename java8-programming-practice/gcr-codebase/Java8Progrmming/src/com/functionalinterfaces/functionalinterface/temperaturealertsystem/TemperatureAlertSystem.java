package com.functionalinterfaces.functionalinterface.temperaturealertsystem;
import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        double threshold = 35.0;

        // Predicate: checks if temperature crosses threshold
        Predicate<Double> isHot = temp -> temp > threshold;

        double currentTemp = 38.5;

        if (isHot.test(currentTemp)) {
            System.out.println(" ALERT: Temperature too high!");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
