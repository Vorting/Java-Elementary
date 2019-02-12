package com.edition5.chapter4.Theory.Vehicle;

public class Factor {

    boolean isFactor(int a, int b) {

        if ((b % a) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
