package com.edition5.chapter6.theory.callByRef;

public class CallByRefDemo {

    public static void main(String[] args) {

        Test ob = new Test(25, 40);

        System.out.println("ob.a and ob.b before call: " + ob.a + ", " + ob.b);

        ob.change(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + ", " + ob.b);
    }
}
