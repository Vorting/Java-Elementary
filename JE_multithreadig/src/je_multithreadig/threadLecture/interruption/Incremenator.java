package je_multithreadig.threadLecture.interruption;

public class Incremenator extends Thread {
    private volatile boolean mIsIncrement = true;

    public void changeAction() {// меняет действие на противоположное
        mIsIncrement = !mIsIncrement;
    }

    @Override
    public void run() {
        do {
            if (!Thread.interrupted()) {// проверка прерывания
                if (mIsIncrement) {
                    Program4.mValue++;
                } else {
                    Program4.mValue--;
                }
                System.out.print(Program4.mValue + " "); //вывод текущего значения переменной
            } else {
                return; //завершение потока
            }
            try {
                //приостановка потока на 0.5 сек.
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return; //завершение потока после прерывания
            }
        } while (true);
    }
}
