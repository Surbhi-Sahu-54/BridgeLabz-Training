package com.encapsulationinterface.ecommerceplatformonlinefooddeliverysystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        System.out.println("----- Online Food Delivery System -----");

        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double discount = item.applyDiscount();

            System.out.println("Total Price: ₹" + total);
            System.out.println(item.getDiscountDetails());
            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Amount: ₹" + (total - discount));
            System.out.println("--------------------------------------");
        }
    }
}
