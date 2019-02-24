package com.je_lesson2.TwoGenerics;

public class TestMe {
    public static void main(String[] args) {

        TwoGenerics<Integer, String> pair = new TwoGenerics<Integer, String>(6, " Apr");

        System.out.println(pair.getFirst() + pair.getSecond());
    }
}
