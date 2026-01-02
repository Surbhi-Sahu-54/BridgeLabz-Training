package com.inheritance.onlineretailordermanagement;

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}