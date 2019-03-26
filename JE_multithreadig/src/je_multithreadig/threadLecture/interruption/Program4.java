package je_multithreadig.threadLecture.interruption;

public class Program4 {
    //Переменная, которой оперирует инкрементор
    public static int mValue = 0;
    static Incremenator mInc; //Объект побочного потока

    public static void main(String[] args) {
        mInc = new Incremenator();  //Создание потока
        System.out.print("Значение = ");
        mInc.start(); // запуск потока
        //Троекратное изменение действия инкрементора с интервалом в i*2 секунд
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(i * 2 * 500);//Ожидание в течении i*2 сек.
            } catch (InterruptedException e) {
            }
            mInc.changeAction();    //Переключение действия
        }
        mInc.interrupt();    //Прерывание побочного потока
    }
}
