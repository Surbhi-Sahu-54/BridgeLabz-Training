package swiftcartthegroceryshoppingapp;

public class PerishableProduct {
	public class PerishableProduct extends Product {

	    public PerishableProduct(String name, double price, int quantity) {
	        super(name, price, "Perishable", quantity);
	    }

	    public double applyProductDiscount(double total) {
	        return total * 0.10; // 10% discount
	    }
	}

}
