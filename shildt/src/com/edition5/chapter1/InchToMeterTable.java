package com.edition5.chapter1;

public class InchToMeterTable {
    public static void main(String args[]) {

        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; // преобразовать в метры
            System.out.println(inches + " inches is " +
                    meters + " meters.");
            counter++;

            // Каждая 12-я выводимая строка должна быть пустой
            if (counter == 12) {
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }
        }
    }
}
