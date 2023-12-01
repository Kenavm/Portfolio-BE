package com.portfolio.backend.exceptions;

public class NoUserByThisIdFoundException extends Exception {

    public NoUserByThisIdFoundException(String message) {
        super(message);
    }
}
