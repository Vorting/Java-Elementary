package com.edition5.chapter3.Theory;

public class Empty {

    public static void main(String args[]) {

        int i;
//        // В определении этого цикла отсутствует итерационное выражение.
//        for (i = 0; i < 10; ) {
//            System.out.println("Pass #" + i);
//            i++; // инкрементировать переменную управления циклом
//        }
//==========================================================================
        i	= 0;
        for (; i < 10; )	{
            System.out.println("Pass #" + i) ;
            i++; // инкрементировать переменную управления циклом
        }

    }
}
