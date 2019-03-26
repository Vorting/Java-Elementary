package je_multithreadig.concurrent.myThread;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {

    CountDownLatch latch;

    MyThread(CountDownLatch count) {
        latch = count;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5;i++){
            System.out.println(i);
            latch.countDown(); // обратный отсчет
        }
    }
}
