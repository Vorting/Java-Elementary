package com.je_lesson2.MyClass;

public class MyClass<T> {
    private T val;

    public MyClass(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}
