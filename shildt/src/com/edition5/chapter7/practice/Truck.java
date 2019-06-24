package com.edition5.chapter7.practice;

public class Truck extends Vehicle {
    private int cargocap; // грузоподъемность в фунтах

    Truck(int p, int f, int m, int c) {
        /* Инициализация переменных из класса Vehicle
        с помощью вызываемого конструктора этого класса. */
        super(p, f, m);
        cargocap = c;
    }

    //методы доступа к переменной cargocap
    int getCargo() {
        return cargocap;
    }

    void putCargo(int c) {
        cargocap = c;
    }
}
