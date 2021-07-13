package com.ederfmatos.purchase.service.impl;

import com.ederfmatos.purchase.ProviderClient;
import com.ederfmatos.purchase.model.Order;
import com.ederfmatos.purchase.model.OrderProvider;
import com.ederfmatos.purchase.model.Provider;
import com.ederfmatos.purchase.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private final ProviderClient providerClient;

    public OrderServiceImpl(ProviderClient providerClient) {
        this.providerClient = providerClient;
    }

    @Override
    public Order createNewOrder(Order order) {
        Provider provider = providerClient.getProviderByState(order.address().uf());
        System.out.println(provider);

        OrderProvider newOrder = providerClient.createNewOrder(order.items());

        System.out.println(newOrder);
        System.out.println(order);

        return new Order(
                newOrder.id(),
                newOrder.items(),
                provider.address(),
                newOrder.status().toString(),
                newOrder.preparationTime()
        );
    }

}
