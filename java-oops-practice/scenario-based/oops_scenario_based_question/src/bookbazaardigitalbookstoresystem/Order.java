package bookbazaardigitalbookstoresystem;

public class Order {
	// Order.java
	// This class handles order details
	    private String orderId;
	    private String orderStatus;

	    // constructor
	    public Order(String orderId) {
	        this.orderId = orderId;
	        this.orderStatus = "Created";
	    }

	    // controlled status update
	    public void confirmOrder() {
	        orderStatus = "Confirmed";
	    }

	    public void cancelOrder() {
	        orderStatus = "Cancelled";
	    }

	    public void showOrderStatus() {
	        System.out.println("Order ID     : " + orderId);
	        System.out.println("Order Status : " + orderStatus);
	    }
}
