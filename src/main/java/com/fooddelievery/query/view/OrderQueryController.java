package com.fooddelievery.query.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderQueryController {

//    @Autowired
//    private OrderViewRepository orderViewRepository;

    public String getOrder() {


        return  " EKS + MSK ";
    }


    /*@GetMapping("/{orderId}")
    public OrderView getOrder(@PathVariable String orderId) {

        *//*return orderViewRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));
*//*
        return  null;
    }
*/
  /*  @GetMapping("/customer/{customerId}")
    public List<OrderView> getCustomerOrders(@PathVariable String customerId) {
        return orderViewRepository.findByCustomerId(customerId);
    }*/
}