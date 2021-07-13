package com.ederfmatos.provider.controller.response;

public record ProviderResponse(
        String id,
        String name,
        AddressResponse address
) {
}
