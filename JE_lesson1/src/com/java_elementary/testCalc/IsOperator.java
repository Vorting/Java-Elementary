package com.java_elementary.testCalc;

public class IsOperator {

    public static String operators = "+-*/";

    public static boolean isOperator(String token) {
        if (token.equals("u-")) return true;
        for (int i = 0; i < operators.length(); i++) {
            if (token.charAt(0) == operators.charAt(i)) return true;
        }
        return false;
    }
}
