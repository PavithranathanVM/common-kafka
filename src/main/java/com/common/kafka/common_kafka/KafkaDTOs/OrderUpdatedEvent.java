package com.common.kafka.common_kafka.KafkaDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderUpdatedEvent
{
    private UUID orderId;
    private UUID customerId;
    private String oldStatus;
    private String newStatus;
    private LocalDateTime updatedAt;
}
