package com.example.common;


import reactor.core.publisher.Mono;

import org.springframework.web.service.annotation.DeleteExchange;

public interface DeletableApi<ENTITY, ID> extends CommonApi<ENTITY, ID> {

    @DeleteExchange(value = "/{id}")
    Mono<Void> delete(ID id);
}
