package org.example.tasks.exception;

public class MidHandlerException extends HandleException {
    public MidHandlerException(String message) {
        super(message);
    }

    public MidHandlerException(String message, Throwable cause) {
        super(message, cause);
    }

    //TODO add proper constructor so exceptions can be chained

}
