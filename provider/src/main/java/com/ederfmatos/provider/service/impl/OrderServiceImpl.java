package com.ederfmatos.provider.service.impl;

import com.ederfmatos.provider.controller.request.OrderItemRequest;
import com.ederfmatos.provider.model.Order;
import com.ederfmatos.provider.model.OrderItem;
import com.ederfmatos.provider.model.OrderStatus;
import com.ederfmatos.provider.model.Product;
import com.ederfmatos.provider.repository.OrderRepository;
import com.ederfmatos.provider.repository.ProductRepository;
import com.ederfmatos.provider.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    @Override
    public Order createNewOrder(List<OrderItemRequest> items) {
        if (items == null) {
            return  null;
        }

        Order order = Order.builder()
                .id(UUID.randomUUID().toString())
                .preparationTime((long) items.size())
                .status(OrderStatus.RECEIVED)
                .build();

        order.setItems(items.stream()
                .map(orderItemRequest -> OrderItem.builder()
                .id(UUID.randomUUID().toString())
                .order(order)
                .product(productRepository.getById(orderItemRequest.id()))
                .quantity(orderItemRequest.quantity())
                .build()).toList()
        );

        return orderRepository.save(order);
    }

    @Override
    public Order findById(String id) {
        return orderRepository.findById(id)
                .orElseThrow();
    }
}
