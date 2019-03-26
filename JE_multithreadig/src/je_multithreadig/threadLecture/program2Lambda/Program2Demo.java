package je_multithreadig.threadLecture.program2Lambda;

public class Program2Demo {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("Привет из главного лямбда потока!"));
        Thread myThreadyLabmda = new Thread(new Runnable() {


            /**
             * Метод будет выполняться в побочном потоке
             */

            @Override
            public void run() {
                System.out.println("Привет из побочного лямбда run() потока");
            }
        });

        myThreadyLabmda.start();
        System.out.println("Главный лямба поток завершен");
    }
}
