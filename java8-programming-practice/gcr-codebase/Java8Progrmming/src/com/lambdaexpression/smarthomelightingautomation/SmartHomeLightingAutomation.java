package com.lambdaexpression.smarthomelightingautomation;

@FunctionalInterface
interface LightBehavior {
    void activate();
}

class SmartLight {
    public void trigger(LightBehavior behavior) {
        behavior.activate();
    }
}

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {

        SmartLight light = new SmartLight();

        // Motion trigger
        light.trigger(() ->
            System.out.println("Motion detected → Lights ON at 70% brightness")
        );

        // Time trigger (night mode)
        light.trigger(() ->
            System.out.println("Night mode → Warm dim lights activated")
        );

        // Voice command trigger
        light.trigger(() ->
            System.out.println("Voice command → Party lights activated")
        );
    }
}

