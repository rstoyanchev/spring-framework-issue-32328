package com.example.common;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PutExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CommonApi<ENTITY, ID> {
    @GetMapping
    @GetExchange
    Flux<ENTITY> getAll();

    @GetMapping("/{id}")
    @GetExchange(value = "/{id}")
    Mono<ENTITY> get(@PathVariable("id") ID id);

    @PutMapping
    @PutExchange
    Mono<ENTITY> put(@RequestBody ENTITY entity);
}
