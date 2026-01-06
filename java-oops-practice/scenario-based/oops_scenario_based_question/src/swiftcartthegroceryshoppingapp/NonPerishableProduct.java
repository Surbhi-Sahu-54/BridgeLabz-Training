package swiftcartthegroceryshoppingapp;

public class NonPerishableProduct {
	public class NonPerishableProduct extends Product {

	    public NonPerishableProduct(String name, double price, int quantity) {
	        super(name, price, "Non-Perishable", quantity);
	    }
	    public double applyProductDiscount(double total) {
	        return total * 0.05; // 5% discount
	    }
	}

}
