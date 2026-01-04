package cabbygoridehailingapp;

class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;
    private boolean rideActive;

    RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    public void bookRide(double distance) {
        double baseFare = 50;

        vehicle.calculateFare(baseFare, distance);
        rideActive = true;

        System.out.println("Ride Booked Successfully!");
        driver.displayDriver();
        vehicle.displayVehicle();
        System.out.println("Estimated Fare: ₹" + vehicle.getFare());
    }

    public void endRide() {
        if (rideActive) {
            rideActive = false;
            System.out.println("Ride Ended. Final Fare: ₹" + vehicle.getFare());
        } else {
            System.out.println("No active ride found!");
        }
    }
}
