package je_multithreadig.concurrent.myThread;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {

        CountDownLatch cdL = new CountDownLatch(5);
        System.out.println("Запуск потока исполнения ");
        new MyThread(cdL);

        try {
            cdL.await();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println("Завершение потока исполнения");
    }
}
