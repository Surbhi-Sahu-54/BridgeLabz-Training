package swiftcartthegroceryshoppingapp;

public class Main {
	    public static void main(String[] args) {

	        Product p1 = new PerishableProduct("Milk", 50, 2);
	        Product p2 = new NonPerishableProduct("Rice", 60, 3);

	        Cart cart = new Cart();
	        cart.addProduct(p1);
	        cart.addProduct(p2);

	        cart.generateBill();
	    }
}
