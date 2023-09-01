package org.example.tasks.handler;

import org.example.tasks.exception.HandleException;
import org.example.tasks.exception.MidHandlerException;

public class MidHandler implements Handler {

    private Handler handler;

    public MidHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle() throws HandleException {
        try {
            handler.handle();
        } catch (HandleException e) {
            throw new MidHandlerException("Inner handler failed: ", e); //this should be in catch block
        }

    }
}
