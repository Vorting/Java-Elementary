package com.edition5.chapter5.practice;
/* Задача. Напишите программу, в которой массив используется для нахождения среднего
арифметического десяти значений типа double. Используйте любые десять чисел.

 */

public class Exercise3Avg {
    public static void main(String[] args) {

        double[] array2 = {1.1, 0.2, 0.3, 0.4, 0.5, 0.6,
                7.7, 8.8, 2.9, 0.10, 0.11, 0.12};

        int i;
        double sum = 0;

        for (i = 0; i < array2.length; i++) {
            sum += array2[i];

        }
        System.out.println("Среднее арифметическое: " + sum / array2.length);
    }
}
