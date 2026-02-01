package com.collectors.orderrevenuesummary;
import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    String getCustomer() {
        return customer;
    }

    double getAmount() {
        return amount;
    }
}
public class OrderRevenueSummary {
     public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Surbhi", 2500),
                new Order("Deep", 1800),
                new Order("Surbhi", 3200),
                new Order("Subh", 1500),
                new Order("Deep", 2200)
        );

        Map<String, Double> revenueByCustomer =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                Order::getCustomer,
                                Collectors.summingDouble(Order::getAmount)
                        ));

        revenueByCustomer.forEach((customer, total) ->
                System.out.println(customer + " total revenue: ₹" + total));
    }

}
