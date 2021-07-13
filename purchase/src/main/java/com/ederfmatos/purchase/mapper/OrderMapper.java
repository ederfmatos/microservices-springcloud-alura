package com.ederfmatos.purchase.mapper;

import com.ederfmatos.purchase.controller.request.OrderNewRequest;
import com.ederfmatos.purchase.controller.response.OrderResponse;
import com.ederfmatos.purchase.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order mapToEntity(OrderNewRequest orderNewRequest);

    @Mapping(source = "id", target = "id")
    OrderResponse mapToResponse(Order order);

}
