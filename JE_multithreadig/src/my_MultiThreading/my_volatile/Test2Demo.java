package my_MultiThreading.my_volatile;

import java.util.Scanner;

public class Test2Demo {

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        myThread1.start();


        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        myThread1.shutDown();

    }
}

class MyThread extends Thread {

    private volatile boolean running = true;

    public void run() {

        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDown() {
        this.running = false;
    }
}

