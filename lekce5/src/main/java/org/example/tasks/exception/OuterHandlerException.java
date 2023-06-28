package org.example.tasks.exception;

public class OuterHandlerException extends HandleException {

    public OuterHandlerException(String message) {
        super(message);
    }

    //TODO add proper constructor so exceptions can be chained
}
