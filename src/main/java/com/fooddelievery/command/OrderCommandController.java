package com.fooddelievery.command;

import com.fooddelievery.event.OrderCreatedEvent;

///import org.apache.kafka.clients.admin.AdminClient;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/orders")
public class OrderCommandController {

   /* @Autowired
    private KafkaTemplate<String, OrderCreatedEvent> kafkaTemplate;
*//*
    @PostMapping
    public String createOrder(@RequestBody CreateOrderCommand command) {
*//*

    @GetMapping
    public String createOrder() {

         CreateOrderCommand command = new CreateOrderCommand();
         command.setQuantity(10);
        command.setProductName("Pizza");
        command.setCustomerId("2");

        System.out.println("   ----------------------   thi sis create order   -------------------------- ");

        // Create event from command
//        OrderCreatedEvent event = new OrderCreatedEvent(command);
        OrderCreatedEvent event = new OrderCreatedEvent();
        event.setOrderId("1");
        event.setItem("piza");
        event.setQuantity(11);
        event.setProductName("piza");
        // Publish to Kafka
    ///   kafkaTemplate.send("order-created-topic", event);
            System.out.println("   ----------------------   sending kafka in  create order   -------------------------- ");

        // Add callback to verify messages are sent
        kafkaTemplate.send("order-created-topic", event)
                .thenAccept(result -> {
                    System.out.println("✅ PRODUCER: Message sent to partition " +
                            result.getRecordMetadata().partition() + ", offset " +
                            result.getRecordMetadata().offset());
                })
                .exceptionally(error -> {
                    System.out.println("❌ PRODUCER FAILED: " + error.getMessage());
                    return null;
                });
        System.out.println("   ----------------------   thi sis create order   -------------------------- ");

        return "Order  successfully! Order ID:  some changes   " ;
    }
    // Add this debug endpoint to your controller
    @GetMapping("/kafka-debug")
    public String kafkaDebug() {
        try {
            // Try to list topics programmatically
            AdminClient admin = AdminClient.create(kafkaTemplate.getProducerFactory().getConfigurationProperties());
            Set<String> topics = admin.listTopics().names().get(10, TimeUnit.SECONDS);
            return "Topics: " + topics;
        } catch (Exception e) {
            return "Kafka error: " + e.getMessage();
        }
    }
*/

}    ////FoodDelivery2-App-Tier
///Instance summary for i-07ce2074d9dbe1bb6 (FoodDelivery-Bastion)