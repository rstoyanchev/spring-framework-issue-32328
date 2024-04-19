package com.example.book.server;

import com.example.book.api.Book;
import com.example.book.api.BookApi;
import com.example.common.CommonDeletableController;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class BookController extends CommonDeletableController<Book, Integer, BookRepository> implements BookApi {
    public BookController(BookRepository repository) {
        super(repository);
    }

    @Override
    public Flux<Book> getAllByGenre(String genre) {
        return repository.findByGenre(genre);
    }
}
