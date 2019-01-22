package com.edition5.chapter2.Theory;


public class ModDemo {

    public static void main(String args[]) {

        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Result and remainder of 10/3=" +
                iresult + "; 10%3 " + irem);
        System.out.println("Result and remainder of 10.0/3.0=" +
                dresult + "; 10%3=" + drem);
    }
}
