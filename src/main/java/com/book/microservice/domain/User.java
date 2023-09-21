package com.book.microservice.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class User {
    private final String alias;
    
    protected User() {
        alias = null;
    }
}
