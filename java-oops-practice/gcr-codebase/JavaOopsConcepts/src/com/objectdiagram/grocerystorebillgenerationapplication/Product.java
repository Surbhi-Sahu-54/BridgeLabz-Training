package com.objectdiagram.grocerystorebillgenerationapplication;

public class Product {
	    private String name;
	    private double quantity;
	    private double price;

	    public Product(String name, double quantity, double price) {
	        this.name = name;
	        this.quantity = quantity;
	        this.price = price;
	    }

	    public double getCost() {
	        return quantity * price;
	    }

	    public String getName() {
	        return name;
	    }
	
}
