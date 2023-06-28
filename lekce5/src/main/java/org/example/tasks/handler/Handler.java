package org.example.tasks.handler;

import org.example.tasks.exception.HandleException;

public interface Handler {
    void handle() throws HandleException;
}
