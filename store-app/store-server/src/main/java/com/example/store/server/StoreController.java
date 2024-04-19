package com.example.store.server;

import com.example.book.api.BookApi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreController {
    private final BookApi bookApi;

    @GetMapping("/{id}")
    public Mono<Store> getStore(@PathVariable String id, @RequestParam(required = false) String genre) {
        return (genre != null ? bookApi.getAllByGenre(genre) : bookApi.getAll())
                .collectList()
                .map(books -> new Store(id, books));
    }
}
