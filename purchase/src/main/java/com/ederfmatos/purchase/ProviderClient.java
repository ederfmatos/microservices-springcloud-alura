package com.ederfmatos.purchase;

import com.ederfmatos.purchase.model.Order;
import com.ederfmatos.purchase.model.OrderItem;
import com.ederfmatos.purchase.model.OrderProvider;
import com.ederfmatos.purchase.model.Provider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("provider")
@RequestMapping("/providers")
public interface ProviderClient {

    @GetMapping("/providers")
    Provider getProviderByState(@RequestParam("state") String state);

    @PostMapping("/orders")
    OrderProvider createNewOrder(@RequestBody List<OrderItem> items);

}
