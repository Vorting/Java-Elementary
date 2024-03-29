package com.edition5.chapter2.Theory;

public class SCops {

    public static void main(String args[]) {

        int n, d, g;
        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }

        d = 0; // установить нулевое значение в переменной d
        // Второй операнд не вычисляется, поскольку значение
        // переменной d равно нулю. Таким образом, укороченный
        // логический оператор предотвращает деление на нуль.
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
            /* А теперь те же самые действия выполняются без укороченного
            логического оператора. На этот раз вычисляются оба операнда,
            в результате чего возникает ошибка деления на нуль.
            */
        if (d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    }

}
