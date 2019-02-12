package com.edition5.chapter5.theory.arrayDemo;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] sample = new int[10];
        int i;

        for (i = 0; i < sample.length; i++) {
            sample[i] = i;
            System.out.println("Элемент [" + i + "]:" + "\t" + sample[i]);
        }

    }
}
