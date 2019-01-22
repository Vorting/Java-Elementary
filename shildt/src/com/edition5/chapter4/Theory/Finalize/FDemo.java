package com.edition5.chapter4.Theory.Finalize;

public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    //вызывается при утилизации обьекта
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }


    //формирует обьект, который тотчас уничтожается
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
