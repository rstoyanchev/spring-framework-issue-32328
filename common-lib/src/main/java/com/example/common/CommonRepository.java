package com.example.common;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CommonRepository<ENTITY, ID> extends ReactiveCrudRepository<ENTITY, ID> {
}
