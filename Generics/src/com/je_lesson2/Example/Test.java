package com.je_lesson2.Example;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        List<String> strList = new ArrayList<String>();
        intList.add(1);
        intList.add(2);
        strList.add("ddd");
        System.out.println("Список до обработки дженерик-методом: " + intList);
        Example.fill(strList, "HELLO");
        System.out.println("Список str " + strList);
        Example.fill(intList, 0);
        System.out.println("Список после обработки дженерик-методом: " + intList);
    }
}
