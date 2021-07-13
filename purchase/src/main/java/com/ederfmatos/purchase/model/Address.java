package com.ederfmatos.purchase.model;

public record Address(
        String street,
        Long number,
        String city,
        String uf
) {
}
