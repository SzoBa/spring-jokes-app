package com.springjoke;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyProvider {

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
