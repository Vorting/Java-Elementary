package com.edition5.chapter6.theory.errInfo;

public class ErrInfoDemo {
    public static void main(String[] args) {

        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);

        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);
    }
}
