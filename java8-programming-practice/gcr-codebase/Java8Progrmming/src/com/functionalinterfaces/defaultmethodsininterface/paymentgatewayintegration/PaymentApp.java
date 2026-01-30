package com.functionalinterfaces.defaultmethodsininterface.paymentgatewayintegration;
public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor upi = new UpiProcessor();
        PaymentProcessor card = new CreditCardProcessor();

        upi.pay(500);
        upi.refund(200);   // uses default

        card.pay(1000);
        card.refund(300);  // overridden version
    }
}
