package com.edition5.chapter6.theory.innerClass;

public class NestedClassDemo {
    public static void main(String[] args) {

        int x[] = {3, 2, 1, 5, 6, 9, 7, 8};

        Outer outer = new Outer(x);

        outer.Analyze();
    }
}
