package com.example.common;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

public interface DeletableApi<ENTITY, ID> extends CommonApi<ENTITY, ID> {

    @DeleteMapping("/{id}")
    @DeleteExchange(value = "/{id}")
    Mono<Void> delete(ID id);
}
