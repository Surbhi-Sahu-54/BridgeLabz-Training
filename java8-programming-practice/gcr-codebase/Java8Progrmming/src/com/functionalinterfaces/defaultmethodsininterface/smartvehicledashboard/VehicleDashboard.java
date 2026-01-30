package com.functionalinterfaces.defaultmethodsininterface.smartvehicledashboard;

public interface VehicleDashboard {
	 void displaySpeed(int speed);

	    // New optional feature
	    default void displayBattery(int percent) {
	        System.out.println("Battery feature not supported.");
	    }
}
