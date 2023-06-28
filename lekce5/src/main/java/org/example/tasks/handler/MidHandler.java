package org.example.tasks.handler;

import org.example.tasks.exception.MidHandlerException;

public class MidHandler implements Handler {

    private Handler handler;

    public MidHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle() throws MidHandlerException {

        //TODO add try catch block and chain exception with MidHandlerException
//        handler.handle();

        throw new MidHandlerException("Inner handler failed: "); //this should be in catch block

    }
}
