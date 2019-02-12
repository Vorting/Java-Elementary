package com.edition5.chapter6.theory;

class MyClass {
    private int alpha; // закрытый доступ
    public int beta; //открытый доступ
    int gamma; // тип доступа по умолчанию (открытый)

    /*Методы доступа к переменной alpha. Переменные класса могут
    обращаться к закрытым переменным этого же класса.
     */
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }

}
