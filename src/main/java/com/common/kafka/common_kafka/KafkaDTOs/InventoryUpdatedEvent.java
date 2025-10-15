package com.common.kafka.common_kafka.KafkaDTOs;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Builder
public class InventoryUpdatedEvent extends BaseEvent {

    private UUID orderId;
    private Map<String,Integer> updatedItem;
    private LocalDateTime updatedAt;

    public InventoryUpdatedEvent(){
        setEventType("InventoryUpdatedEvent");
    }

}
