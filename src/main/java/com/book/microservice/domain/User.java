package com.book.microservice.domain;

public class User {
    private String alias;

    public User() {
    }
    
    public User(String johnDoe) {
        this.alias = johnDoe;
    }

    public String getAlias() {
        return alias;
    }
}
