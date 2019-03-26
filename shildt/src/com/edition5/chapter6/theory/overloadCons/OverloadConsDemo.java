package com.edition5.chapter6.theory.overloadCons;

public class OverloadConsDemo {
    public static void main(String[] args) {

        MyClass test1 = new MyClass();
        MyClass test2 = new MyClass(88);
        MyClass test3 = new MyClass(17.23);
        MyClass test4 = new MyClass(2, 4);

        System.out.println("test1.x: " + test1.x);
        System.out.println("test2.x: " + test2.x);
        System.out.println("test3.x: " + test3.x);
        System.out.println("test4.x: " + test4.x);

    }
}
