package com.example.demo.exeption;

public class ApiRequesExeption extends RuntimeException {
    public ApiRequesExeption(String message) {
        super(message);
    }

    public ApiRequesExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
