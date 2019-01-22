package com.java_elementary.testCalc;

public class Operators {

    public static String operators = "+-*/";

    static boolean isOperator(String token) {
        for (int i = 0; i < operators.length(); i++) {
            if (token.charAt(0) == operators.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
