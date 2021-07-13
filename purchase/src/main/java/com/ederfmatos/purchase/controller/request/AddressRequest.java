package com.ederfmatos.purchase.controller.request;

public record AddressRequest(
        String street,
        Long number,
        String city,
        String uf
) {
}