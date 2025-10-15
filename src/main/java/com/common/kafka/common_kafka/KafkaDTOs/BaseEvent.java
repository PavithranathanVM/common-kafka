package com.common.kafka.common_kafka.KafkaDTOs;

import lombok.Data;

@Data
public abstract class BaseEvent {
    private String eventType;
    private long timeStamp = System.currentTimeMillis();
}
