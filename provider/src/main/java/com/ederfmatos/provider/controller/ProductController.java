package com.ederfmatos.provider.controller;

import com.ederfmatos.provider.controller.response.ProductResponse;
import com.ederfmatos.provider.mapper.ProductMapper;
import com.ederfmatos.provider.model.Product;
import com.ederfmatos.provider.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;

    @GetMapping
    public List<ProductResponse> findByState(@RequestParam("state") String state) {
        List<Product> products = productService.findByState(state);
        return productMapper.mapToResponse(products);
    }

}
