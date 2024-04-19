package com.example.book.client;

import com.example.book.api.Book;
import com.example.book.api.BookApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * The current state of the client generator requires to override all methods that have any
 * generics which is far from ideal (also requiring to re-annotate the affected parameters)
 */
public interface BookClient extends BookApi {

    @Override
    Mono<Book> put(@RequestBody Book book);

    @Override
    Mono<Void> delete(@PathVariable("id") Integer id);

    @Override
    Flux<Book> getAll();

    @Override
    Mono<Book> get(@PathVariable("id") Integer id);

    default Flux<Book> getWithoutGenre() {
        return getAllByGenre(Book.NO_GENRE);
    }
}
