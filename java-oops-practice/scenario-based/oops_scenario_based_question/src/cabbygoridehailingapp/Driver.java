package cabbygoridehailingapp;

class Driver {

    private String name;
    private String licenseNumber;
    private double rating;

    Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void displayDriver() {
        System.out.println("Driver: " + name + " | Rating: " + rating);
    }
}
