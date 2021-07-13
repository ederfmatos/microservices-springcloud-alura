package com.ederfmatos.provider.controller.response;

import com.ederfmatos.provider.model.OrderStatus;

import java.util.List;

public record OrderResponse(
        String id,
        Long preparationTime,
        OrderStatus status,
        List<OrderItemResponse> items
) {
}
