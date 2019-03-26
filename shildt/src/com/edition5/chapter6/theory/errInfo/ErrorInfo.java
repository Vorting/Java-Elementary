package com.edition5.chapter6.theory.errInfo;

public class ErrorInfo {

    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds exception"
    };

    int howBad[] = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length) {
            return new Err(msgs[i], howBad[i]);
        } else {
            return new Err(" Invalid Error Code", 0);
        }
    }
}
