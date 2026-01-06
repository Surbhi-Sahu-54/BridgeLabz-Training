package swiftcartthegroceryshoppingapp;

public class Product {    protected String name;
    protected double price;
    protected String category;
    protected int quantity;

    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    // price * quantity
    public double calculatePrice() {
        return price * quantity;
    }

    // Polymorphic discount method
    public double applyProductDiscount(double total) {
        return 0; // default: no discount
    }

    public String getName() {
        return name;
    }
}

