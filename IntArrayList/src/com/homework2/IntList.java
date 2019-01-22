package com.homework2;

public interface IntList {

    void add(int value);
    void add(int value, int index);
    int get(int index) throws IllegalAccessException;
    int size();

}
