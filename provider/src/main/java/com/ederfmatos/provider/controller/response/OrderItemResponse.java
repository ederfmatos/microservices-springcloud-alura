package com.ederfmatos.provider.controller.response;

public record OrderItemResponse(
    String id,
    Integer quantity,
    ProductResponse product
){
}
