package com.ederfmatos.provider.controller.response;

import java.math.BigDecimal;

public record ProductResponse(
        String id,
        String name,
        String uf,
        String description,
        BigDecimal price
) {
}
