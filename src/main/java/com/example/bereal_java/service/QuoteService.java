package com.example.bereal_java.service;

// service is used for the following:
// if i had a StoryRepo i can interact both Quote and Storyrepo in this service file
// if i had 2 tables that refer to each other. organizing employees + offices relationships


import com.example.bereal_java.model.Quote;
import com.example.bereal_java.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {
    @Autowired
    QuoteRepository quoteRepository;
    public Quote createQuote(Quote quoteString){
        return quoteRepository.save(quoteString);
    }
    public List<Quote> getQuotes() {
        return quoteRepository.findAll();
    }
    public void deleteQuote(Long ID) {
        quoteRepository.deleteById(ID);
    }

    public Quote updateQuote(Long ID, Quote newQuoteString) {
        Quote quote = quoteRepository.findById(ID).get();
        quote.setQuote(newQuoteString.getQuote());
        return quoteRepository.save(newQuoteString);
    }
}