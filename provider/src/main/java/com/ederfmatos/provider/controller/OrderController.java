package com.ederfmatos.provider.controller;

import com.ederfmatos.provider.controller.request.OrderItemRequest;
import com.ederfmatos.provider.controller.response.OrderResponse;
import com.ederfmatos.provider.mapper.OrderMapper;
import com.ederfmatos.provider.model.Order;
import com.ederfmatos.provider.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final OrderMapper orderMapper;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public OrderResponse findById(@PathVariable("id") String id) {
        Order order = orderService.findById(id);
        return orderMapper.mapToResponse(order);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponse create(@RequestBody List<OrderItemRequest> orderItems) {
        Order order = orderService.createNewOrder(orderItems);
        return orderMapper.mapToResponse(order);
    }

}
