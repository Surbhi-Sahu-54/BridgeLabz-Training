package com.objectmodeling.Ecommerceplatform;

public class Customer {
	    private String customerName;

	    public Customer(String customerName) {
	        this.customerName = customerName;
	    }

	    // Communication
	    public void placeOrder(Order order) {
	        System.out.println("Customer " + customerName + " placed an order.");
	        order.showOrderDetails();
	    }
	}


