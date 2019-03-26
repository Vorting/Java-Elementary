package com.edition5.chapter6.theory.callByRef;

public class Test {

    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    /* Передача объекта методу. Теперь переменные ob.a и ob.b
    из передаваемого объекта можно изменить. */
    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }


}
