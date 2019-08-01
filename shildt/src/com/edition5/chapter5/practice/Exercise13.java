package com.edition5.chapter5.practice;

/* Перепишите рассмотренный ранее в этой главе класс MinMax таким образом, чтобы
в нем использовалась разновидность for-each цикла for.
 */
public class Exercise13 {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49};
        int min, max;
        min = max = nums[0];
        for (Integer n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println("max is " + max + " \nmin is " + min);
    }
}
