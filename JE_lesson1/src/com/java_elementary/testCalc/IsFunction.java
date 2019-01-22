package com.java_elementary.testCalc;

public class IsFunction {

    public static boolean isFunction(String token) {
        if (token.equals("sqrt") || token.equals("cube") || token.equals("pow10")) return true;
        return false;
    }
}
