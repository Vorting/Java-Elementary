package com.edition5.chapter5.theory.forEach;

public class NoChange {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.print(x + " ");
            // след. операция не оказывает никакого влияния на содержимое массива nums
            x *= 10;

        }
        System.out.println();

        for (int x: nums){
            System.out.print(x+" ");
            System.out.print("");
        }

    }
}
