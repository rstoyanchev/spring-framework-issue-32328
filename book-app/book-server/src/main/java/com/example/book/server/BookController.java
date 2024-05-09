package com.example.book.server;

import com.example.book.api.Book;
import com.example.book.api.BookApi;
import com.example.common.CommonDeletableController;
import reactor.core.publisher.Flux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping({"/book", "/books"})
@RestController
public class BookController extends CommonDeletableController<Book, Integer, BookRepository> implements BookApi {
    public BookController(BookRepository repository) {
        super(repository);
    }

    @Override
    @GetMapping(params = "genre")
    public Flux<Book> getAllByGenre(String genre) {
        return repository.findByGenre(genre);
    }
}
