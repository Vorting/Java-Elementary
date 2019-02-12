package com.edition5.chapter5.tests;
/*	Измените программу, написанную в примере для опробования 5.1, таким образом,
чтобы она сортировала массив символьных строк. Продемонстрируйте ее работоспособность.
 */

public class Exercise4 {
    public static void main(String[] args) {

        int size = 10;
//        int[] nums = {99, -10, 100123, 18, -978,
//                5623, 463, -9, 287, 49};
        char[] nums = new char[size];
        nums[0] ='a';
        nums[1] ='q';
        nums[2] ='p';
        nums[3] ='f';
        nums[4] ='e';
        nums[5] ='d';
        nums[6] ='b';
        nums[7] ='c';
        nums[8] ='y';
        nums[9] ='z';
        int a, b, t;

        System.out.print(" Original array is: \n");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
            System.out.println();
        }

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--)
                if (nums[b - 1] > nums[b]) { // если требуемый порядок
                    // следования не соблюдается, поменять элементы местами
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = (char) t;
                }
        System.out.print(" Sorted array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

    }
}
