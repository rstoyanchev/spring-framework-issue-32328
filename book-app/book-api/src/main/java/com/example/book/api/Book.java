package com.example.book.api;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(schema = "example_db", name = "book")
public class Book {
    public static final String NO_GENRE = "<NO_GENRE>";

    @Id
    Integer id;
    String genre;

    public static Book withGenre(String genre) {
        var book = new Book();
        book.setGenre(genre);
        return book;
    }

    public static Book withoutGenre() {
        return withGenre(NO_GENRE);
    }
}
