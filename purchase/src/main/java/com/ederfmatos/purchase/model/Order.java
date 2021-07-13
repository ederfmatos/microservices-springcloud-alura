package com.ederfmatos.purchase.model;

import java.util.List;

public record Order(
        String id,
        List<OrderItem> items,
        Address address
) {
}
