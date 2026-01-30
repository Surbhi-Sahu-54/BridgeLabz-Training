package com.functionalinterfaces.implementinginterface.digitalpaymentinterface;

class Wallet implements DigitalPayment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}
