package com.ederfmatos.provider.controller.response;

public record AddressResponse(
        String street,
        Long number,
        String city,
        String uf
) {
}
