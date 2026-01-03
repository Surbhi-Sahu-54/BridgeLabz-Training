package smarthomeautomationsystem;

	abstract class Appliance implements Controllable {

	    private boolean isOn;
	    private int powerUsage;

	    Appliance(int powerUsage) {
	        this.powerUsage = powerUsage;
	        this.isOn = false;
	    }

	    // Encapsulation: internal state hidden
	    protected void setOn(boolean status) {
	        this.isOn = status;
	    }

	    public boolean isOn() {
	        return isOn;
	    }

	    public int getPowerUsage() {
	        return powerUsage;
	    }

	    // Helper Method
	    protected void displayStatus(String deviceName) {
	        System.out.println(deviceName + " is " + (isOn ? "ON" : "OFF"));
	    }
	
}
