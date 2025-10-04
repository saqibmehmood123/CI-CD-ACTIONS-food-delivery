package com.fooddelievery.query.view;

import lombok.Data;
/*import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity*/
@Data
public class OrderView {
   /// @Id
    private String orderId;
    private String productName;
    private Integer quantity;
    private String customerId;
  ///  private LocalDateTime timestamp;
    private String status; // e.g., "CREATED", "PREPARING", "DELIVERED"
}