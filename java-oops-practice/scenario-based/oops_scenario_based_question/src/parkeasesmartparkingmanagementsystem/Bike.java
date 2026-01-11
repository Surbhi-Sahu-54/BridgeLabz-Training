package parkeasesmartparkingmanagementsystem;

	class Bike extends Vehicle {

	    public Bike(String vehicleNumber) {
	        super(vehicleNumber, 20);
	    }

	    @Override
	    public double calculateCharges(int hours) {
	        double amount = baseRate * hours;
	        if (hours > 6) {
	            amount += 50;
	        }
	        return amount;
	    }
}
