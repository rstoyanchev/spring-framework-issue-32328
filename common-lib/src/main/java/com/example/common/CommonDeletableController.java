package com.example.common;

import reactor.core.publisher.Mono;

public abstract class CommonDeletableController<ENTITY, ID, REPO extends CommonRepository<ENTITY, ID>> extends CommonController<ENTITY, ID, REPO> implements DeletableApi<ENTITY, ID> {

    public CommonDeletableController(REPO repository) {
        super(repository);
    }

    @Override
    public Mono<Void> delete(ID id) {
        return repository.deleteById(id);
    }
}
