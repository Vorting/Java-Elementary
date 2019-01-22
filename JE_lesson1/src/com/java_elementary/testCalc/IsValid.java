package com.java_elementary.testCalc;

public class IsValid {

    boolean isValid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') {
            return false;
        } else {
            return true;
        }
    }
}
