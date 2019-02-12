package com.edition5.chapter5.tests.Queue;

import com.edition5.chapter5.tests.QDemo.QDemo;

/*
Класс, реализующий очередь для хранения символов
 */
public class Queue {

    char q[]; //массив для хранения элементов очереди
    int putloc, getloc; //индексы для вставки и извлечения элементов очереди


    public Queue(int size) {
        q = new char[size + 1]; //выделить память для очереди
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    //Извлекаем символ из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
