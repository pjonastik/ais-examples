package org.example.tasks.handler;

import org.example.tasks.exception.HandleException;
import org.example.tasks.exception.InnerHandlerException;

public class InnerHandler implements Handler {
    @Override
    public void handle() throws HandleException {
        throw new InnerHandlerException("Inner info about error!");
    }
}
