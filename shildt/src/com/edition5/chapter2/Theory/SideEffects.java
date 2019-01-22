package com.edition5.chapter2.Theory;

public class SideEffects {

    public static void main(String args[]) {

        int i;
        i = 0;

        /* Значение переменной i все равно инкрементируется, несмотря
        на то, что проверяемое условие в операторе if ложно. */
        if (false & (++i < 100)) {
            System.out.println("this won't be displayed");
        }

        System.out.println("if statements executed: " + i); // выводится 1
        /* В данном случае значение переменной i не инкрементируется,
        поскольку второй операнд укороченного логического оператора
        не вычисляется, а следовательно, инкремент пропускается. */
        if (false && (++i < 100)) {
            System.out.println("this won't be displayed");
        }
        System.out.println("if statements executed: " + i); // still 1 !!
    }
}
