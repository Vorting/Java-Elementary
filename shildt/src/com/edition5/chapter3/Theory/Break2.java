package com.edition5.chapter3.Theory;

public class Break2 {

    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        // "Бесконечный" цикл, завершаемый с помощью оператора break.
        System.out.println("Input symbols: ");
        for (; ; ) {

            ch = (char) System.in.read(); // ввести символ с клавиатуры
            if (ch == 'q') {
                break;
            }
        }
        System.out.println("You pressed q!");

    }
}
