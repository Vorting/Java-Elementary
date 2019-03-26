package je_multithreadig.concurrent.waitNotifyTest;

/*
Notifier будет обрабатывать объект Message, а затем вызывать метод notify,
чтобы разбудить ожидающие объект Message потоки.
 */
public class Notifier implements Runnable {

    private Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "стаhтовал");

        try {
            Thread.sleep(500);
            synchronized (message) {
                message.setMessage(name + " поток Notifier отработал");
                message.notify();
                // message.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
