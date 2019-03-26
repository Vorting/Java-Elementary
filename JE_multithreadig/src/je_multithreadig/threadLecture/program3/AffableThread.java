package je_multithreadig.threadLecture.program3;

public class AffableThread extends Thread {

    @Override
    public void run() {
        System.out.println("Привет из побочного потока!");
    }
}
