package com.example.bereal_java.model;

import javax.persistence.*;

@Entity
@Table (name = "quotes")
public class Quote {

    //    not necessary but can keep this func and try breaking the program
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quoteID")
        private Long id;

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Column(name = "quote_string")
    private String quote;

}
