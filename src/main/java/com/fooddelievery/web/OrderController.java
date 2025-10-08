package com.fooddelievery.web;

import com.fooddelievery.model.Order;
//import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

  ////  private final KafkaTemplate<String, Order> kafkaTemplate; // Note the type: KafkaTemplate<String, Order>

/*
    public OrderController(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
*/

    @GetMapping("/order")
    public String placeOrder() {
        // Add current timestamp and version
        String timestamp = java.time.LocalDateTime.now().toString();
        return "  mid night ci-cd " ;
    }

    // Add new endpoint
    @GetMapping("/order/status")
    public String getOrderStatus() {
        return "Order Status: DELIVERED ✅ | Last Updated: " +
                java.time.LocalDateTime.now().toString();
    }

}
