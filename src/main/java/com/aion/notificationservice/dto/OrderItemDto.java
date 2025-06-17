package com.aion.notificationservice.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class OrderItemDto {
    private UUID productId;
    private int quantity;
}
