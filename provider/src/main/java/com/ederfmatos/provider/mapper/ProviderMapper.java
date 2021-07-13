package com.ederfmatos.provider.mapper;

import com.ederfmatos.provider.controller.response.ProviderResponse;
import com.ederfmatos.provider.model.Provider;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public interface ProviderMapper {

    @Mapping(source = "id", target = "id")
    ProviderResponse mapToResponse(Provider provider);

}
