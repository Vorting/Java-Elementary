package je_multithreadig.atomic.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingThread implements Runnable {


    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            count.incrementAndGet();
        }
    }

    public int getCount() {
        return count.get();

    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

