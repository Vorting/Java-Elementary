package je_multithreadig.myThreadsTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsDemo {

    public static void main(String[] args) throws Exception {


        Ticker first = new Ticker("firstThread");
        Ticker second = new Ticker("secondThread");

//        first.run();
//        System.out.println();
//        second.run();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(first);
        executorService.submit(second);
    }
}
