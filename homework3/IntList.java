package com.homework3;

//Интерфейс, здесь нет реализации методов,
// только их объявления:
public interface IntList {
    void add(int value);

    int get(int index);

    int size();

    void add(int element, int index);//метод который вставляет в середину

    void remove(int i);

    int count();
}
