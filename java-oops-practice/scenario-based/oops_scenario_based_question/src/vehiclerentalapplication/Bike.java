package vehiclerentalapplication;

class Bike extends Vehicle {

    Bike(String vehicleNumber) {
        super(vehicleNumber, 300);
    }

    public double calculateRent(int days) {
        return baseRate * days;
    }
}
