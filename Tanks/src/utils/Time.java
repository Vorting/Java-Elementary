package utils;

public class Time {

    public static final long SECOND = 1000000000l; //хранит в себе колл-во наносекунд в секундах

    public static long get() {
        return System.nanoTime();
    }

}
