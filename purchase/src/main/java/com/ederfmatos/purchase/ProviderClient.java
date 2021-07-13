package com.ederfmatos.purchase;

import com.ederfmatos.purchase.model.Provider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider")
public interface ProviderClient {

    @GetMapping("/providers/providers")
    Provider getProviderByState(@RequestParam("state") String state);

}
