package vehiclerentalapplication;

class Customer {
    private String name;
    private int customerId;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId + ", Name: " + name);
    }
}
