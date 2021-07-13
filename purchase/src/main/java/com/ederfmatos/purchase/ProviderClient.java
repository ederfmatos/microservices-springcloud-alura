package com.ederfmatos.purchase;

import com.ederfmatos.purchase.model.Provider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider")
@RequestMapping("/providers")
public interface ProviderClient {

    @GetMapping("/providers")
    Provider getProviderByState(@RequestParam("state") String state);

}
