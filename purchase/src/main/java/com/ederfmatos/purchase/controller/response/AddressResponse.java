package com.ederfmatos.purchase.controller.response;

public record AddressResponse(
        String street,
        Long number,
        String city,
        String uf
) {
}
