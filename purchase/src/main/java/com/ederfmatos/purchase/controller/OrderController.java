package com.ederfmatos.purchase.controller;

import com.ederfmatos.purchase.controller.request.OrderNewRequest;
import com.ederfmatos.purchase.controller.response.OrderResponse;
import com.ederfmatos.purchase.mapper.OrderMapper;
import com.ederfmatos.purchase.model.Order;
import com.ederfmatos.purchase.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final OrderMapper orderMapper;

    public OrderController(OrderService orderService, OrderMapper orderMapper) {
        this.orderService = orderService;
        this.orderMapper = orderMapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponse createOrder(@RequestBody OrderNewRequest orderNewRequest) {
        Order order = orderMapper.mapToEntity(orderNewRequest);
        order = orderService.createNewOrder(order);
        return orderMapper.mapToResponse(order);
    }

}
