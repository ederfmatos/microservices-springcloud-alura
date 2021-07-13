package com.ederfmatos.purchase.controller.response;

public record OrderItemResponse(String id, Integer quantity, ProductResponse product) {
}
