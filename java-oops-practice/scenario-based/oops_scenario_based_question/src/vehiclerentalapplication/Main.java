package vehiclerentalapplication;

public class Main{
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Surbhi");

        Vehicle bike = new Bike("BIKE101");
        Vehicle car = new Car("CAR202", true);
        Vehicle truck = new Truck("TRUCK303", 1200);

        c1.displayCustomer();

        System.out.println("Bike Rent (3 days): ₹" + bike.calculateRent(3));
        System.out.println("Car Rent (3 days): ₹" + car.calculateRent(3));
        System.out.println("Truck Rent (3 days): ₹" + truck.calculateRent(3));
    }
}
