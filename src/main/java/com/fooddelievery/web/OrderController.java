package com.fooddelievery.web;

import com.fooddelievery.model.Order;
//import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
        return "  thanks Siddique bhai ,   he is here : " +
                System.currentTimeMillis() + " | Time: " + timestamp + " | Version: 2.0";
    }

    // Add new endpoint
    @GetMapping("/order/status")
    public String getOrderStatus() {
        return "Order Status: DELIVERED ✅ | Last Updated: " +
                java.time.LocalDateTime.now().toString();
    }

}
