package com.edition5.chapter6.theory.callByValue;

public class Test {

    /* Этот метод не может изменить значения аргументов,
    передаваемых ему при вызове. */
    void noChange(int i, int j) {
        i = i + j;
        j=-j;
    }
}
