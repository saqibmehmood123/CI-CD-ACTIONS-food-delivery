package com.fooddelievery.event;

import lombok.Data;

@Data
public class DeliveryCompletedEvent {
    private String eventId;       // Unique ID for this event
    private String orderId;       // The order that was delivered (MOST important field)
    private String status;        // Should be "DELIVERED"
    private String driverId;      // Who delivered it (for tracking/analytics)
    private Long timestamp;       // When it was delivered
    // Optionally: customerRating, deliveryNotes, etc.
}
