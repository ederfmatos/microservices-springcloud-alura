package com.ederfmatos.provider.service.impl;

import com.ederfmatos.provider.model.Provider;
import com.ederfmatos.provider.repository.ProviderRepository;
import com.ederfmatos.provider.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class ProviderServiceImpl implements ProviderService {

    private final ProviderRepository providerRepository;

    @Override
    public Provider getProviderByState(String state) {
        return providerRepository.findByAddress_Uf(state)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Fornecedor não encontrado"));
    }

}
