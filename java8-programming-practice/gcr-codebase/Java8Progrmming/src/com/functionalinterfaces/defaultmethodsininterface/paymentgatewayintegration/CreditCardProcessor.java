package com.functionalinterfaces.defaultmethodsininterface.paymentgatewayintegration;

	class CreditCardProcessor implements PaymentProcessor {

	    @Override
	    public void pay(double amount) {
	        System.out.println("Paid ₹" + amount + " via Credit Card");
	    }

	    // Optional: override refund behavior
	    @Override
	    public void refund(double amount) {
	        System.out.println("Refund ₹" + amount + " to Credit Card");
	    }
	
}
