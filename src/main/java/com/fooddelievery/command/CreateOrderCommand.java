package com.fooddelievery.command;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateOrderCommand {
    private String productName;
    private Integer quantity;
    private String customerId;
}

