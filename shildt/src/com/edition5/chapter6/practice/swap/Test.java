package com.edition5.chapter6.practice.swap;


public class Test {

    int a;

    Test(int i) {
        a = i;
    }

    void swap(Test object1, Test object2) {
        int tmp;

        tmp = object1.a;
        object1.a = object2.a;
        object2.a = tmp;
    }
}
