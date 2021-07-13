package com.ederfmatos.purchase.controller.request;


import java.util.List;

public record OrderNewRequest(
        List<OrderItemRequest> items,
        AddressRequest address
) {
}
