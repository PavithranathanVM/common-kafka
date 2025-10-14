package com.common.kafka.common_kafka.KafkaDTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryUpdatedEvent {

    private UUID orderId;
    private Map<String,Integer> updatedItem;
    private LocalDateTime updatedAt;

}
