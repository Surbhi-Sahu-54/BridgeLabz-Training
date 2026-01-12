package foodlooprestaurantorderingsystem;
import java.util.ArrayList;

	class Order implements IOrderable {

	    private ArrayList<FoodItem> items = new ArrayList<>();
	    private double total;

	    // Constructor for combo meals
	    public Order(FoodItem... foodItems) {
	        for (FoodItem item : foodItems) {
	            if (item.isAvailable()) {
	                items.add(item);
	                total += item.getPrice();   // operator usage
	                item.reduceStock();
	            }
	        }
	    }

	    // Polymorphic discount
	    public double applyDiscount() {
	        if (total >= 1000) {
	            return total * 0.20;   // 20% discount
	        } else if (total >= 500) {
	            return total * 0.10;   // 10% discount
	        }
	        return 0;
	    }

	    public double getFinalAmount() {
	        return total - applyDiscount();
	    }

	    @Override
	    public void placeOrder() {
	        System.out.println("Order placed successfully!");
	        System.out.println("Total Amount: ₹" + getFinalAmount());
	    }

	    @Override
	    public void cancelOrder() {
	        System.out.println("Order cancelled.");
	    }
}
