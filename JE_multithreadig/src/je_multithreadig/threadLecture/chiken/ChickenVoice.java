package je_multithreadig.threadLecture.chiken;

public class ChickenVoice {

    static EggVoice egg; // Побочный поток

    public static void main(String[] args) {
        egg = new EggVoice(); // создаем поток

        System.out.println("Спор начат...");
        egg.start(); //запуск потока
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500); // приостанавливаем поток на 1 секунду
            } catch (InterruptedException e) {
                System.out.println("курица!");
            }
            if (egg.isAlive()) // Если оппонент еще не сказал последнее слово
                try {
                    egg.join(); // подождать пока оппонент закончит "высказываться"
                } catch (InterruptedException e) {
                    System.out.println("Первым появилось яйцо!");
                }
            else { // если оппонент уже закончил " высказываться"
                System.out.println("Первой появилась курица!");
            }
            System.out.println("Спор законччен");
        }
    }
}
