package com.edition5.chapter6.theory.overload;

public class OverloadDemo {

    public static void main(String[] args) {


        Overload ob = new Overload();
        int resInt;
        double resDouble;

        ob.ovlDemo();
        System.out.println(ob);

        ob.ovlDemo(2);
        System.out.println();

        resInt = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4,6): " + resInt);

        System.out.println();

        resDouble = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32):" + resDouble);


    }
}
