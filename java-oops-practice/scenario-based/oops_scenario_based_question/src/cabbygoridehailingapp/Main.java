package cabbygoridehailingapp;

public class Main {
	    public static void main(String[] args) {

	        Vehicle vehicle = new SUV("MP09XZ1234"); // Polymorphism
	        Driver driver = new Driver("Rohit", "DL12345", 4.8);

	        IRideService ride = new RideService(vehicle, driver);

	        ride.bookRide(12);  // distance in km
	        ride.endRide();
	    }
}
