package com.je_lesson2.Example;

import java.util.List;

public class Example {
    public static <T> void fill(List<T>list, T val){
        for (int i=0; i<list.size(); i++)list.set(i, val);
    }
}
