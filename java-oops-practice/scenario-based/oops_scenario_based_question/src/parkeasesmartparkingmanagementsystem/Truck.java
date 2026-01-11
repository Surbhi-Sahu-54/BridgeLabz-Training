package parkeasesmartparkingmanagementsystem;

	class Truck extends Vehicle {

	    public Truck(String vehicleNumber) {
	        super(vehicleNumber, 100);
	    }

	    @Override
	    public double calculateCharges(int hours) {
	        double amount = baseRate * hours;
	        if (hours > 4) {
	            amount += 200;
	        }
	        return amount;
	    }
}
