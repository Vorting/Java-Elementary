package com.java_elementary.testCalc;

public class Priority {

    private static String operators = "+-*/";
    private static String delimiters = "() " + operators;
    private static boolean flag = true;

    static int priority(String token) {
        if (token.equals("(")) return 1;
        if (token.equals("+") || token.equals("-")) return 2;
        if (token.equals("*") || token.equals("/")) return 3;
        return 4;
    }
}
