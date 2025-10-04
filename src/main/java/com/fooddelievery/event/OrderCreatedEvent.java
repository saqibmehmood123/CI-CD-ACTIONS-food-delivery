package com.fooddelievery.event;

import com.fooddelievery.command.CreateOrderCommand;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class OrderCreatedEvent   {
    private String orderId;
    private String productName;
    private Integer quantity;
    private String customerId;
    private String item;
    private LocalDateTime timestamp;

    public OrderCreatedEvent() {
        // Required for JSON deserialization
    }
/*
    public OrderCreatedEvent(CreateOrderCommand command) {
        this.orderId = java.util.UUID.randomUUID().toString();
        this.productName = command.getProductName();
        this.quantity = command.getQuantity();
        this.customerId = command.getCustomerId();
        this.timestamp = LocalDateTime.now();
    }*/
}