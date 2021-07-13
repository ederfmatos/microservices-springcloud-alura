package com.ederfmatos.provider.service.impl;

import com.ederfmatos.provider.model.Product;
import com.ederfmatos.provider.repository.ProductRepository;
import com.ederfmatos.provider.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findByState(String state) {
        return productRepository.findAllByUf(state);
    }

}
