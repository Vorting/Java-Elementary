package je_multithreadig.concurrent.waitNotifyTest;
/* в этом классе находится монитор на объекте Message,
используя синхронизирующий блок.
  */


public class Waiter implements Runnable {

    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (message) {

            try {
                System.out.println(name + " ждем вызов метода notify:" +
                        System.currentTimeMillis());
                message.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " был вызов метода notify: " + System.currentTimeMillis());
            // обработаем наше сообщение
            System.out.println(name + " : " + message.getMessage());
        }
    }
}
