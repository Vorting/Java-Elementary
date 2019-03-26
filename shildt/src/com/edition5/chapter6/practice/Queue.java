package com.edition5.chapter6.practice;

public class Queue {

    private char[] q; // массив для хранения элементов очереди
    private int putLoc, getLoc; // индексы размещения и извлечения элементов очереди

    public Queue(int size) {
        this.q = new char[size + 1];
        putLoc = getLoc = 0;
    }

    //Конструироуем очередь из существующего обьекта типа Queue
    Queue(Queue ob) {
        putLoc = ob.putLoc;
        getLoc = ob.getLoc;
        q = new char[ob.q.length];

        //скопируем элементы в очередь
        for (int i = getLoc + 1; i <= putLoc; i++) {
            q[i] = ob.q[i];
        }
    }

    // Сконструируем очередь из массива исходных значений
    Queue(char a[]) {
        putLoc = 0;
        getLoc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }


    // помещаем символ в очередь

    void put(char ch) {
        if (putLoc == q.length - 1) {
            System.out.println(" - Queue is full.");
            return;
        }
        putLoc++;
        q[putLoc] = ch;
    }

    // извлекаем символ из очереди
    char get() {
        if (getLoc == putLoc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        getLoc++;
        return q[getLoc];
    }


}
