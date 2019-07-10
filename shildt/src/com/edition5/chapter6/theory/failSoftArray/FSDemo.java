package com.edition5.chapter6.theory.failSoftArray;

public class FSDemo {
    public static void main(String[] args) {

        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // выявить скрытые сбои при обращении к массиву
        System.out.println("Fail quietly.");

        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.getErrVal(i);
            if (x != -1) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");

        // обработаем сбои и выведем сообщения об ошибках
        System.out.println("\nFail with error reports.");
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) {
                System.out.println("Index " + i + " out-of-bounds");
            }
        }
        for (int i = 0; i < (fs.length) * 2; i++) {
            x = fs.getErrVal(i);
            if (x != -1) {
                System.out.print(x + " ");
            } else {
                System.out.println("Index " + i + " out-of-bounds");
            }
            System.out.print("");
        }
    }
}
