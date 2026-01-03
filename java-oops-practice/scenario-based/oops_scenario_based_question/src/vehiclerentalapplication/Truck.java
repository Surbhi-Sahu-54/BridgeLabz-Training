package vehiclerentalapplication;

class Truck extends Vehicle {

    private double loadWeight;

    Truck(String vehicleNumber, double loadWeight) {
        super(vehicleNumber, 1500);
        this.loadWeight = loadWeight;
    }

    private double calculateLoadSurcharge() {
        if (loadWeight > 1000)
            return 500;
        return 0;
    }

    public double calculateRent(int days) {
        return (baseRate * days) + calculateLoadSurcharge();
    }
}
