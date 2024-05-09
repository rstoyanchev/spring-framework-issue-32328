package com.example.book.api;

import com.example.common.DeletableApi;
import reactor.core.publisher.Flux;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "/book", contentType = MediaType.APPLICATION_JSON_VALUE, accept = MediaType.APPLICATION_JSON_VALUE)
public interface BookApi extends DeletableApi<Book, Integer> {
    @GetExchange
    Flux<Book> getAllByGenre(@RequestParam(value = "genre") String genre);
}
