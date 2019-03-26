package je_multithreadig.threadLecture.chiken;

public class EggVoice extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000); // приостанавливаем поток на 1 секундну
            } catch (InterruptedException e) {
                System.out.println("яйцо!");
            }
            // слово яйцо "сказано" 5 раз
        }
    }
}
