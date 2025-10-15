package com.common.kafka.common_kafka.KafkaDTOs;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
public class OrderCreatedEvent extends BaseEvent {

    private UUID orderId;
    private UUID customerId;
    private String status;
    List<OrderItemEvent> orderItems;
    LocalDateTime createdAt;

    public OrderCreatedEvent() {
        setEventType("OrderCreatedEvent");
    }
}
