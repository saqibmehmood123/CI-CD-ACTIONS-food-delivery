package com.fooddelievery.query.view;

import com.fooddelievery.event.OrderCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
///import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEventConsumer {

//    @Autowired
//    private OrderViewRepository orderViewRepository;

  /*@KafkaListener(
          topics = "order-created-topic",
          groupId = "order-service-group",
          containerFactory = "kafkaListenerContainerFactory"
  )
*/
    public void consumeOrderCreatedEvent(OrderCreatedEvent event) {
    System.out.println("*** LISTENER ACTIVATED ***"); // Add this first

      System.out.println("  listener line 1 : " + event.getCustomerId());
      System.out.println("  listener line 2: " + event.getProductName());
      System.out.println(" listener line 3: " + event.getQuantity());

/*
      command.setQuantity(10);
      command.setProductName("Pizza");
      command.setCustomerId("2");
*/



      // Convert event to read model
/*        OrderView orderView = new OrderView();
        orderView.setOrderId(event.getOrderId());
        orderView.setProductName(event.getProductName());
        orderView.setQuantity(event.getQuantity());
        orderView.setCustomerId(event.getCustomerId());
  ///      orderView.setTimestamp(event.getTimestamp());
        orderView.setStatus("CREATED");*/

        // Save to read database
//        orderViewRepository.save(orderView);

        System.out.println("Order view created: " + event.getOrderId());
    }
}