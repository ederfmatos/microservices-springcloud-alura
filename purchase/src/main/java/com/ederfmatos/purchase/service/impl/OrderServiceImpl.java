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

    @Override
    public Order createNewOrder(Order order) {
        RestTemplate restTemplate = new RestTemplate();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl("http://localhost:8081/providers/providers")
                .queryParam("state", order.address().uf())
                .build();

        ResponseEntity<Provider> response = restTemplate.exchange(uriComponents.toUriString(), HttpMethod.GET, null, Provider.class);
        Provider provider = response.getBody();
        System.out.println(provider);

        System.out.println(order);
        return new Order(UUID.randomUUID().toString(), order.items(), order.address());
    }

}
