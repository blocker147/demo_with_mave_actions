package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
class ExceptionHandlerControllerAdvice {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    protected final ResponseEntity<ExceptionResponse> handleException(final Exception exception) {
        return new ResponseEntity<>(ExceptionResponse.of(exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
    protected record ExceptionResponse(LocalDateTime localDateTime, int code, String message) {
        static ExceptionResponse of(String message) {
            return new ExceptionResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST.value(), message);
        }
    }
}
