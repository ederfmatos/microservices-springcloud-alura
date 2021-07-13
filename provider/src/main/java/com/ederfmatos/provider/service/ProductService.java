package com.ederfmatos.provider.service;

import com.ederfmatos.provider.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findByState(String state);

}
