package com.example.common;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class CommonController<ENTITY, ID, REPO extends CommonRepository<ENTITY, ID>> implements CommonApi<ENTITY, ID> {

    protected final REPO repository;

    public CommonController(REPO repository) {
        this.repository = repository;
    }

    @Override
    public Flux<ENTITY> getAll() {
        return repository.findAll();
    }

    @Override
    public Mono<ENTITY> get(ID id) {
        return repository.findById(id);
    }

    @Override
    public Mono<ENTITY> put(ENTITY entity) {
        return repository.save(entity);
    }
}
