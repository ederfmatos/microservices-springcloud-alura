package com.ederfmatos.purchase.model;

import java.util.List;

public record OrderProvider(
        String id,
        OrderStatus status,
        List<OrderItem> items,
        Long preparationTime
) {
}
