package je_multithreadig.threadLecture.program3;

public class Program3Demo {
    public static void main(String[] args) {
        AffableThread mSecondThread = new AffableThread();
        mSecondThread.start();
        System.out.println("Главный поток завершен...");
    }
}
