package com.example.store.server;

import com.example.book.api.Book;

import java.util.List;

public record Store(String id, List<Book> books) {
}
