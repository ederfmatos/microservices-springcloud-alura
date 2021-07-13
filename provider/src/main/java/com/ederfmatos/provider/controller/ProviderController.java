package com.ederfmatos.provider.controller;

import com.ederfmatos.provider.controller.response.ProviderResponse;
import com.ederfmatos.provider.mapper.ProviderMapper;
import com.ederfmatos.provider.model.Provider;
import com.ederfmatos.provider.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/providers")
@RequiredArgsConstructor
public class ProviderController {

    private final ProviderService providerService;
    private final ProviderMapper providerMapper;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ProviderResponse getProviderByState(@RequestParam("state") String state) {
        Provider provider = providerService.getProviderByState(state);
        return providerMapper.mapToResponse(provider);
    }

}
