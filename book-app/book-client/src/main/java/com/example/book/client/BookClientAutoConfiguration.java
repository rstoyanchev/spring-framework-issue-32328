package com.example.book.client;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@AutoConfiguration
@EnableConfigurationProperties(BookClientProperties.class)
public class BookClientAutoConfiguration {
    @Bean
    public BookClient casinoClient(WebClient.Builder webClientBuilder, BookClientProperties properties) {
        return HttpServiceProxyFactory.builder()
                .exchangeAdapter(WebClientAdapter.create(webClientBuilder
                        .baseUrl(properties.url())
                        .build()))
                .build().createClient(BookClient.class);
    }
}
