package com.ederfmatos.purchase.controller.response;

import java.util.List;

public record OrderResponse(
        String id,
        List<OrderItemResponse> items,
        AddressResponse address,
        String status
){

}
