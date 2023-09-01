package org.example.tasks.handler;

import org.example.tasks.exception.HandleException;
import org.example.tasks.exception.OuterHandlerException;

public class OuterHandler implements Handler {

    private Handler handler;

    public OuterHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle() throws HandleException {
        try {
            handler.handle();
        } catch (HandleException e) {
            throw new OuterHandlerException("OUTER: Handler cannot be finished!", e);
        }

    }
}
