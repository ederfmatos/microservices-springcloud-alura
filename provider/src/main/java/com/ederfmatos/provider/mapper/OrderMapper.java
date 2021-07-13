package com.ederfmatos.provider.mapper;

import com.ederfmatos.provider.controller.response.OrderResponse;
import com.ederfmatos.provider.controller.response.ProviderResponse;
import com.ederfmatos.provider.model.Order;
import com.ederfmatos.provider.model.Provider;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public interface OrderMapper {

    @Mapping(source = "id", target = "id")
    OrderResponse mapToResponse(Order order);

}
