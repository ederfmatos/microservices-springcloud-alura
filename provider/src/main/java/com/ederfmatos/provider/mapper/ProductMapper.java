package com.ederfmatos.provider.mapper;

import com.ederfmatos.provider.controller.response.ProductResponse;
import com.ederfmatos.provider.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface ProductMapper {

    @Mapping(source = "id", target = "id")
    ProductResponse mapToResponse(Product product);

    List<ProductResponse> mapToResponse(List<Product> products);

}
