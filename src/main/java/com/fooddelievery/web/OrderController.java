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

        System.out.println( " ---------------------------  this is order service i am sedning order   --------------------------");

        // Set a initial status
        /// @RequestBody
        Order order = new Order();
        order.setOrderId("1");
        order.setStatus("true");
        order.setItem("my tiem ");
        order.setQuantity(4);
        order.setCustomerId("2");


        order.setStatus("PENDING");
        // Send the entire Order object to the 'orders' topic. The key could be the orderId.
   //     kafkaTemplate.send("orders", order.getOrderId(), order);
        return "Order placed successfully: " + order.getOrderId();
    }
}
