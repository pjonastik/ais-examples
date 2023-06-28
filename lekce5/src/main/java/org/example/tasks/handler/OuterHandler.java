package org.example.tasks.handler;

import org.example.tasks.exception.HandleException;
import org.example.tasks.exception.OuterHandlerException;

public class OuterHandler implements Handler {

    private Handler handler;

    public OuterHandler(Handler handler) {
        this.handler = handler;
    }

    public void handle() throws HandleException {
        //TODO comment out the code and add try catch block and then chain exception
        // with MidHandlerException in catch block
//        handler.handle();
        throw new OuterHandlerException("OUTER: Handler cannot be finished!"); //this should be in catch block
    }
}
