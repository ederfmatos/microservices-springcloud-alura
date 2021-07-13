package com.ederfmatos.provider.service;

import com.ederfmatos.provider.controller.request.OrderItemRequest;
import com.ederfmatos.provider.model.Order;

import java.util.List;

public interface OrderService {

    Order createNewOrder(List<OrderItemRequest> orderItems);

    Order findById(String id);

}
