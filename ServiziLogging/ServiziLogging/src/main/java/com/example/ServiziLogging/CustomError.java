package com.example.ServiziLogging;

public class CustomError extends RuntimeException{
    public CustomError(String message) {
        super(message);
    }
}
