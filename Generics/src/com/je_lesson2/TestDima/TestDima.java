package com.je_lesson2.TestDima;

public class TestDima<D, I, Years> {
    D object1;
    I object2;
    Years object3;

    TestDima(D name, I surname, Years years) {
        object1 = name;
        object2 = surname;
        object3 = years;
    }

    public D getName() {
        return object1;
    }

    public I getSurname() {
        return object2;
    }

    public Years getYears() {
        return object3;
    }
}
