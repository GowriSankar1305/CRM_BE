package com.gowrisankar.crm.authservice.service;

import java.util.function.Function;

public interface ModelMapperService<DTO, ENTITY> {
    Function<DTO, ENTITY> toEntity();
    Function<ENTITY, DTO> toDto();
}