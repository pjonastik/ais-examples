package org.example.tasks.exception;

public class InnerHandlerException extends HandleException {
    public InnerHandlerException(String message) {
        super(message);
    }

    //TODO add proper constructor so exceptions can be chained
}
