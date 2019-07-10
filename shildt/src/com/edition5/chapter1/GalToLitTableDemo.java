package com.edition5.chapter1;

public class GalToLitTableDemo {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0; // устанавлвиваем нулевое значение
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // преобразуем в литр
            System.out.println(gallons + " gallons is " + liters + " liters.");

            // приращение счетчика строк происходит на каждом шаге цикла,
            // а через каждые десять строк выводится пустая строка
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0; //сбрасываем счетчик
            }
        }
    }
}
