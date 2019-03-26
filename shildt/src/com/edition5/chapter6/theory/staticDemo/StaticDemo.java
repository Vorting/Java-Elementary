package com.edition5.chapter6.theory.staticDemo;

public class StaticDemo {
    public static void main(String[] args) {

        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " +
                StaticMeth.valDiv2());

        StaticMeth.val = 4;
        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(: " +
                StaticMeth.valDiv2());
    }
}

