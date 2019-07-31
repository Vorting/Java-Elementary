package com.edition5.chapter5.theory.ragged;

public class Ragged {


    public static void main(String[] args) {

        int[][] riders = new int[7][];
        // для первых пяти элементов длинна массива
        // по второму размеру равна 10
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        //  для остальных двух элементов длина
        //  массива по второму размеру равна 2
        riders[5] = new int[2];
        riders[6] = new int[2];

        int i, j;

        // Сформируем произвольные данные
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                riders[i][j] = i + j + 10;
            }
        }
        for (i = 5; i < 7; i++) {
            for (j = 0; j < 2; j++) {
                riders[i][j] = i + j + 10;
            }
        }
        System.out.println("Koлличecтвo пассажиров, перевезенных " +
                "каждым рейсом, в будние дни недели:");

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(riders[i][j] + " ");
                System.out.println();
            }
            System.out.println();
        }
//        System.out.println();

        System.out.println("Koличecтвo пассажиров, перевезенных каждым\n" +
                "рейсом, в выходные дни:");

        for (i = 5; i < 7; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(riders[i][j] + " ");
                System.out.println();
            }
        }
    }
}
