package com.functionalinterfaces.implementinginterface.digitalpaymentinterface;

class UPI implements DigitalPayment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
