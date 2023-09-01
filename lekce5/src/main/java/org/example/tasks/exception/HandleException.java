package org.example.tasks.exception;

public class HandleException extends Exception {
    //TODO add constructor

    public HandleException(String message) {
        super(message);
    }

    public HandleException(String message, Throwable cause) {
        super(message, cause);
    }
}
