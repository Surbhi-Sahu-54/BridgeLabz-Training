package swiftcartthegroceryshoppingapp;

	public class Cart implements ICheckout {

	    private Product[] products;
	    private int count;
	    private double totalPrice; // only Cart can update

	    // Constructor without items
	    public Cart() {
	        products = new Product[10];
	        count = 0;
	        totalPrice = 0;
	    }

	    // Constructor with pre-selected items
	    public Cart(Product[] initialProducts) {
	        this();
	        for (Product p : initialProducts) {
	            addProduct(p);
	        }
	    }

	    public void addProduct(Product product) {
	        products[count++] = product;
	        calculateTotal();
	    }

	    // Encapsulated price calculation
	    private void calculateTotal() {
	        totalPrice = 0;
	        for (int i = 0; i < count; i++) {
	            totalPrice += products[i].calculatePrice();
	        }
	    }

	    @Override
	    public void applyDiscount(double coupon) {
	        totalPrice = totalPrice - coupon; // operator usage
	    }
	    public void generateBill() {
	        double productDiscount = 0;

	        System.out.println("----- SwiftCart Bill -----");
	        for (int i = 0; i < count; i++) {
	            Product p = products[i];
	            double itemTotal = p.calculatePrice();
	            productDiscount += p.applyProductDiscount(itemTotal);

	            System.out.println(
	                p.getName() +
	                " | Quantity: " + p.quantity +
	                " | Item Total: " + itemTotal
	            );
	        }

	        System.out.println("Total Price: " + totalPrice);
	        System.out.println("Product Discount: " + productDiscount);

	        applyDiscount(productDiscount);

	        System.out.println("Final Amount Payable: " + totalPrice);
	    }
}
