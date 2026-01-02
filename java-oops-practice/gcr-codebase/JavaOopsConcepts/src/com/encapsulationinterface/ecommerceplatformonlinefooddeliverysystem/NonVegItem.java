package com.encapsulationinterface.ecommerceplatformonlinefooddeliverysystem;
public class NonVegItem extends FoodItem {

    private static final double EXTRA_CHARGE = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5% (Extra Charge ₹50 applied)";
    }
}
