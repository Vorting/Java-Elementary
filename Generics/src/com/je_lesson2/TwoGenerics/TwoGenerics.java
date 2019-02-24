package com.je_lesson2.TwoGenerics;

public class TwoGenerics<T, A> {

    T object1;
    A object2;

    TwoGenerics(T one, A two) {
        object1 = one;
        object2 = two;
    }

    public T getFirst() {
        return object1;
    }

    public A getSecond() {
        return object2;
    }
}
