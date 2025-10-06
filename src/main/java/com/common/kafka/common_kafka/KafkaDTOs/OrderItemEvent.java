package com.common.kafka.common_kafka.KafkaDTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemEvent {

    private UUID productId;
    private String productName;
    private String productCategory;
    private BigDecimal quantity;
    private BigDecimal price;

}