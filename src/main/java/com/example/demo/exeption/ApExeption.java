package com.example.demo.exeption;

import org.springframework.http.HttpStatus;

public class ApExeption {
    private final String message;
    private final HttpStatus httpStatus;

    public ApExeption(String message,
                      Throwable throwable,
                      HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
