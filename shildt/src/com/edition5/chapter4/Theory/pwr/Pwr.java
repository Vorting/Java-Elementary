package com.edition5.chapter4.Theory.pwr;

public class Pwr {

    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        // Здесь ключевое слово this обозначает ссылку
        // на переменные b и е, а не на параметры,
        this.b = base;
        this.e = exp;

        val = 1;
        if (exp == 0) {
            return;
        }
        for (; exp > 0; exp--) {
            this.val *= base;
        }
    }

    double get_pwr() {
        return this.val;
    }
}
