package com.inheritance.onlineretailordermanagement;

public class Order {
	    protected int orderId;
	    protected String orderDate;

	    Order(int orderId, String orderDate) {
	        this.orderId = orderId;
	        this.orderDate = orderDate;
	    }

	    String getOrderStatus() {
	        return "Order Placed";
	    }

}
