package com.edition5.chapter6.theory.errorMsg;

public class ErrorMsg {
    String[] msgs = {"Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds Exception"
    };

    String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length) {
            return msgs[i];
        } else {
            return "Invalid Error Code";
        }
    }


}
