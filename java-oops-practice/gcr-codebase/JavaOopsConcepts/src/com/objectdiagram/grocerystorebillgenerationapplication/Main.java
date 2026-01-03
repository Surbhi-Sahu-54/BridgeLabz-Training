package com.objectdiagram.grocerystorebillgenerationapplication;

public class Main {
	    public static void main(String[] args) {

	        Customer alice = new Customer("Alice");

	        alice.addProduct(new Product("Apples", 2, 3));
	        alice.addProduct(new Product("Milk", 1, 2));

	        BillGenerator billGenerator = new BillGenerator();
	        billGenerator.generateBill(alice);
	    }
	
}
