package medistorepharmacyinventorysalessystem;
import java.time.LocalDate;

	class Medicine implements ISellable {

	    protected String name;
	    protected double price;
	    protected LocalDate expiryDate;

	    private int quantity;        // hidden stock
	    private double costPrice;    // sensitive pricing logic

	    // Constructor with default quantity
	    Medicine(String name, double price, LocalDate expiryDate) {
	        this(name, price, expiryDate, 50);
	    }

	    // Constructor with custom quantity
	    Medicine(String name, double price, LocalDate expiryDate, int quantity) {
	        this.name = name;
	        this.price = price;
	        this.expiryDate = expiryDate;
	        this.quantity = quantity;
	        this.costPrice = price * 0.6; // internal logic
	    }

	    // Sell medicine
	    public double sell(int qty) {
	        if (qty > quantity) {
	            System.out.println("Insufficient stock!");
	            return 0;
	        }
	        quantity -= qty;

	        double total = price * qty;

	        // discount operator
	        if (qty >= 10) {
	            total = total - (total * 0.10);
	        }
	        return total;
	    }

	    // Default expiry logic
	    public boolean checkExpiry() {
	        return LocalDate.now().isAfter(expiryDate);
	    }

	    public int getQuantity() {
	        return quantity;
	    }

}
