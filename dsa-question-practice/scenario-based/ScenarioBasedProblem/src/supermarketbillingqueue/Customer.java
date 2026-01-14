package supermarketbillingqueue;
import java.util.HashMap;

public class Customer {
	    String customerName;
	    HashMap<String, Integer> cart;   // itemName -> quantity

	    public Customer(String customerName) {
	        this.customerName = customerName;
	        this.cart = new HashMap<>();
	    }

	    public void addItemToCart(String itemName, int quantity) {
	        cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
	    }
}
