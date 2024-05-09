package com.example.common;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PutExchange;

public interface CommonApi<ENTITY, ID> {
    @GetExchange
    Flux<ENTITY> getAll();

    @GetExchange(value = "/{id}")
    Mono<ENTITY> get(@PathVariable("id") ID id);

    @PutExchange
    Mono<ENTITY> put(@RequestBody ENTITY entity);
}
