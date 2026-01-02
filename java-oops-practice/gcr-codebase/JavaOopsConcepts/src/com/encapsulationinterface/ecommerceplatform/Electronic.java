package com.encapsulationinterface.ecommerceplatform;

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price){
        super(id, name, price);
    }

    public double calculateDiscount(){
        return getPrice() * 0.10; // 10% discount
    }
    
    public double calculateTax(){
        return getPrice() * 0.18; // 18% GST
    }
    
    public String getTaxDetails(){
        return "18% GST applied (Electronics)";
    }
}
