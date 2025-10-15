package com.common.kafka.common_kafka.KafkaDTOs;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Builder
public class OrderItemEvent extends BaseEvent{

    private UUID productId;
    private String productName;
    private String productCategory;
    private BigDecimal quantity;
    private BigDecimal price;

    public OrderItemEvent()
    {
        setEventType("OrderItemEvent");
    }

}