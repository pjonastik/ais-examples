package org.example.worker;

import java.util.Random;

public class EngetoWorker implements Worker {
    @Override
    public void work() throws WorkerException {
        System.out.println("I work fine without errors :)");
    }
}
