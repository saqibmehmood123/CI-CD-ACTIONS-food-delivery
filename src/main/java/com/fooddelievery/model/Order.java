package com.fooddelievery.model;

// Important: Your class must have a default (no-arg) constructor for JSON deserialization!
public class Order {
    private String orderId;
    private String customerId;
    private String item;
    private int quantity;
    private String status;

    // Default constructor (REQUIRED)
    public Order() {
    }

    // All arguments constructor (optional but useful)
    public Order(String orderId, String customerId, String item, int quantity, String status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.item = item;
        this.quantity = quantity;
        this.status = status;
    }

    // Getters and Setters (REQUIRED)
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Order{" + "orderId='" + orderId + '\'' + ", item='" + item + '\'' + ", status='" + status + '\'' + '}';
    }
}