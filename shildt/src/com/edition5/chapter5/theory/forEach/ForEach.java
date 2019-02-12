package com.edition5.chapter5.theory.forEach;

public class ForEach {

    public static void main(String[] args) {


        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // используем разновидность for-each цикла for для суммирования и отображения значений
        for (int x : nums) {
            System.out.println("Значение x: " + x);
            sum += x;
//            if (x == 5) {
//                break;
//            }
        }
        System.out.println("Сумма: " + sum);
    }
}
