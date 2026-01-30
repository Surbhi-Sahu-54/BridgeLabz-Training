package com.functionalinterfaces.defaultmethodsininterface.paymentgatewayintegration;

class UpiProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}
