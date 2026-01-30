package com.functionalinterfaces.implementinginterface.digitalpaymentinterface;
public class PaymentApp {

    public static void main(String[] args) {

        DigitalPayment upi = new UPI();
        DigitalPayment card = new CreditCard();
        DigitalPayment wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
}
