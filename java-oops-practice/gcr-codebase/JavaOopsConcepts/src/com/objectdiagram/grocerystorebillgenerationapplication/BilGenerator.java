package com.objectdiagram.grocerystorebillgenerationapplication;

public class BilGenerator {

	package com.objectdiagram.grocerystorebillgenerationapplication;

	public class BillGenerator {

	    public double calculateTotal(Customer customer) {
	        double total = 0;
	        for (Product p : customer.getProducts()) {
	            total += p.getCost();
	        }
	        return total;
	    }

	    public void generateBill(Customer customer) {
	        System.out.println("Customer: " + customer.getName());
	        System.out.println("Total Bill: $" + calculateTotal(customer));
	    }
	}
