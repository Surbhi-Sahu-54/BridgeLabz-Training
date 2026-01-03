package vehiclerentalapplication;

class Car extends Vehicle {

    private boolean isAC;

    Car(String vehicleNumber, boolean isAC) {
        super(vehicleNumber, 1000);
        this.isAC = isAC;
    }

    private double calculateACSurcharge(int days) {
        return isAC ? 200 * days : 0;
    }
    public double calculateRent(int days) {
        return (baseRate * days) + calculateACSurcharge(days);
    }
}
