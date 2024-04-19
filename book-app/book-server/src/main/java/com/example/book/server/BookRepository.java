package com.example.book.server;

import com.example.book.api.Book;
import com.example.common.CommonRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface BookRepository extends CommonRepository<Book, Integer> {
    Flux<Book> findByGenre(String genre);
}
