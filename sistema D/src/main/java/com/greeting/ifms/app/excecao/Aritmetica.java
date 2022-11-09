package com.greeting.ifms.app.excecao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class Aritmetica extends RuntimeException {

    public Aritmetica(String message) {
        super(message);
    }
}