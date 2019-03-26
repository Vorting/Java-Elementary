package com.edition5.chapter2.practice;

/*Задача.2. В этом проекте предстоит создать программу,которая
отображает таблицу истинности для логических операторов Java.
Для удобства восприятия отображаемой информации следует выровнять столбцы таблицы.
В данном проекте используется ряд языковых средств, рассмотренных ранее в этой
главе, включая управляющие последовательности и логические операторы,
а также демонстрируются отличия в предшествовании арифметических и логических операторов.
*/
public class LogicalOpTable {
    public static void main(String args[]) {

        int p, q;

        System.out.println("P \tQ \tAND\tOR\tXOR\tNOT");
        p = 1;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (q!=p));

        p = 1;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (q!=p));

        p = 0;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (q!=p));
        p = 0;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (q  !=p));
    }
}
