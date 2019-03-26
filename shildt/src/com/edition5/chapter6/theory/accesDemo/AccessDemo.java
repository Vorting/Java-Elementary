package com.edition5.chapter6.theory.accesDemo;

class AccessDemo {
    public static void main(String[] args) {

        MyClass ob = new MyClass();
        /* Доступ к переменной alpha возможен только с помощью
        специально предназначенных для этой цели методов. */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // Обратиться к переменной alpha так, как показано ниже, нельзя.
        // ob.alpha =10;
        // Ошибка! alpha - закрытая переменная!

        ob.beta = 88;         // Следующие обращения вполне допустимы, так как
        ob.gamma = 99;       // переменные beta и gamma являются открытыми,


    }
}
