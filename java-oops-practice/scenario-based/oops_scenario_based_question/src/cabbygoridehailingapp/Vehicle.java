package cabbygoridehailingapp;

abstract class Vehicle {

    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    private double fare;        // sensitive data
    private double ratePerKm;   // hidden pricing logic

    Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation: fare calculation hidden
    protected void calculateFare(double baseFare, double distance) {
        fare = baseFare + (distance * ratePerKm);
    }

    public double getFare() {
        return fare;
    }

    public void displayVehicle() {
        System.out.println(type + " | Vehicle No: " + vehicleNumber + " | Capacity: " + capacity);
    }
}
