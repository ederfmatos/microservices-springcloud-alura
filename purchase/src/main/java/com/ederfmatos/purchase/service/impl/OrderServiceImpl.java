package com.ederfmatos.purchase.service.impl;

import com.ederfmatos.purchase.model.Order;
import com.ederfmatos.purchase.model.Provider;
import com.ederfmatos.purchase.service.OrderService;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private final RestTemplate restTemplate;

    public OrderServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Order createNewOrder(Order order) {
        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl("http://PROVIDER/providers/providers")
                .queryParam("state", order.address().uf())
                .build();

        ResponseEntity<Provider> response = this.restTemplate.exchange(uriComponents.toUriString(), HttpMethod.GET, null, Provider.class);
        Provider provider = response.getBody();
        System.out.println(provider);

        System.out.println(order);
        return new Order(UUID.randomUUID().toString(), order.items(), order.address());
    }

}
