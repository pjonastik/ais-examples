package org.example.worker;

import java.util.Random;

public class AisWorker implements Worker {

    @Override
    public void work() throws WorkerException { //notice throws part at method definition
        Random random = new Random();
        if (random.nextBoolean()) {
            throw new WorkerException("Something went wrong :(");
        }
    }
}
