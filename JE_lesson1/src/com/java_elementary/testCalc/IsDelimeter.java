package com.java_elementary.testCalc;

import com.java_elementary.testCalc.ParseList;

import static com.java_elementary.testCalc.ParseList.delimiters;

public class IsDelimeter {

    public static boolean isDelimiter(String token) {
        if (token.length() != 1) {
            return false;
        }
        for (int i = 0; i < delimiters.length(); i++) {
            if (token.charAt(0) == delimiters.charAt(i)) return true;
        }
        return false;
    }
}
