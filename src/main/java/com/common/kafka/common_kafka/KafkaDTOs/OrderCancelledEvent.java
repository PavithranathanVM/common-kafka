package com.common.kafka.common_kafka.KafkaDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class OrderCancelledEvent extends BaseEvent {

    private UUID orderId;
    private UUID customerId;
    private String reason;
    private LocalDateTime cancelledAt;

    public OrderCancelledEvent()
    {
        setEventType("OrderCancelledEvent");
    }

}
