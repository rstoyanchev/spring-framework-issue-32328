package com.example.book.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("book.client")
public record BookClientProperties(
        @DefaultValue("http://localhost:8081")
        String url
) {
}
