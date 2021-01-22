package com.example.demo.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ApiExeptionHandler {
    @ExceptionHandler(value = {ApiRequesExeption.class})
    public ResponseEntity<Object> responseEntity(ApiRequesExeption e){
        ApExeption  apExeption= new ApExeption(e.getMessage(),  e, HttpStatus.BAD_REQUEST);
        return  new ResponseEntity<>(apExeption,HttpStatus.NOT_FOUND);
    }
}
