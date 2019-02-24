package com.je_lesson2.WildCards;

import java.util.ArrayList;
import java.util.List;

public class sum {

    public static Double sum(List<? extends Number> numList) {
        Double result = 0.0;
        for (Number num : numList) {
            result += num.doubleValue();
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> intList1 = new ArrayList<Integer>();
        intList1.add(1);
        intList1.add(2);
        intList1.add(3);
        sum(intList1);
        List<? super Integer> intList2 = new ArrayList<Integer>();
        intList2.add(11);
        System.out.println("The intList is: " + intList2);
    }
}
