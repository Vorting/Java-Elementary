package com.edition5.chapter2.Theory;

public class CastDemo {

    public static void main(String args[]) {

        double x, y;
        byte b;
        int i;
        char ch;
        x = 10.0;
        y = 3.0;
        // В данном случае теряется дробная часть числа.
        i = (int) (x / y); // привести тип double к типу int
        System.out.println("Integer outcome of x / y: " + i);
        i = 100;
        // А в этом случае данные не теряются. Тип byte может
        // содержать значение 100.
        b = (byte) i;
        System.out.println("Value of b: " + b);
        i = 257;
        //На этот раз данные теряются. Тип byte не может
        // содержать значение 257.
        b = (byte) i;
        System.out.println("Value of b: " + b);
        b = 88; // Представление символа X в коде ASCII.
        //И снова требуется явное приведение несовместимых типов.
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}
