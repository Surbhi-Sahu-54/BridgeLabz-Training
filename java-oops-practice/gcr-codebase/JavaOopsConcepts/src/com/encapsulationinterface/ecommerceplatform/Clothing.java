package com.encapsulationinterface.ecommerceplatform;

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price){
        super(id, name, price);
    }

    public double calculateDiscount(){
        return getPrice() * 0.20; // 20% discount
    }

    public double calculateTax(){
        return getPrice() * 0.05; // 5% VAT
    }
   
    public String getTaxDetails(){
        return "5% VAT applied (Clothing)";
    }
}


