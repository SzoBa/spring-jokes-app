package com.springjoke.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService implements QuoteService{

    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;


    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
