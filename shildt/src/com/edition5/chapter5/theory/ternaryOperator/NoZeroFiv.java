package com.edition5.chapter5.theory.ternaryOperator;

public class NoZeroFiv {
    public static void main(String[] args) {

        int result;

//====================================================================
//        for (int i = -5; i < 6; i++) {
//            result = i != 0 ? 100 / i : 0;
//            if (i != 0) {
//                System.out.println("100 / " + i + " is " + result);
//            }
//        }
//====================================================================

        for (int i = -5; i < 6; i++) {
            if (i != 0 ? true : false) {
                System.out.println("100 / "+i+" is "+100/i);
            }
        }
    }

}
