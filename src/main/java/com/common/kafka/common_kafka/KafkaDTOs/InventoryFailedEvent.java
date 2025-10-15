package com.common.kafka.common_kafka.KafkaDTOs;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
public class InventoryFailedEvent extends BaseEvent{
    private UUID orderId;
    private List<String> missingProducts;
    private LocalDateTime timeStamp;

    public  InventoryFailedEvent()
    {
        setEventType("InventoryFailedEvent");
    }
}
