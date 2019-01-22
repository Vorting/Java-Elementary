package com.edition5.chapter5.theory.bubleSort;

public class BubleSort {

    public static void main(String[] args) {

        int[] nums = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49};

        int a, b, t;
        int size = 10;

        //отображаем исходный массив
        System.out.println("Исходный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
//            System.out.println();
            //сортировка пузырьком
            for (a = 1; a < size; a++) {
                for (b = size - 1; b >= a; b--) {
                    if (nums[b - 1] > nums[b]) {// если требуемый порядок
                        t = nums[b - 1];        // следования не соблюдается,
                        nums[b - 1] = nums[b];  // поменять элементы местами
                        nums[b] = t;
                    }
                }
            }
            //сортировка пузырьком
        }
        // Отобразить отсортированный массив
        System.out.println("\nOтcopтиpoвaнный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
//            System.out.println();
        }
        System.out.println();
    }
}