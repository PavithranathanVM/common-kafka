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
public class OrderUpdatedEvent extends BaseEvent
{
    private UUID orderId;
    private UUID customerId;
    private String oldStatus;
    private String newStatus;
    private LocalDateTime updatedAt;

    public OrderUpdatedEvent()
    {
        setEventType("OrderUpdatedEvent");
    }
}
