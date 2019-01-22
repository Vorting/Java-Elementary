package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<Integer> linkedList = new java.util.LinkedList<>();
        // head -> [5] -> [1] -> [2] -> [3] -> [4]

        List<Integer> arrayList = new ArrayList<>();

        // [7] [6] [1] [2] [3] [4]

        messureTime(linkedList);
        messureTime(arrayList);
    }

    private static void messureTime(List<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
