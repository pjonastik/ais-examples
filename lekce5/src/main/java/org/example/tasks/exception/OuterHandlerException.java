package org.example.tasks.exception;

public class OuterHandlerException extends HandleException {

    public OuterHandlerException(String message) {
        super(message);
    }

    public OuterHandlerException(String message, Throwable cause) {
        super(message, cause);
    }

    //TODO add proper constructor so exceptions can be chained
}
