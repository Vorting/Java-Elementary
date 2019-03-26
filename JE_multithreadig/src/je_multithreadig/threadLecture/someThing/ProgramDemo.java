package je_multithreadig.threadLecture.someThing;

public class ProgramDemo {
    public static void main(String[] args) {

        SomeThing mThing = new SomeThing(); // создаем поток "MyThready"
        Thread myThready = new Thread(mThing); // запуск потока

        myThready.start();
        System.out.println("Главный поток завершен...");
    }
}
