package com.edition5.chapter5.practice.showBitz;
/* Написать программу, которая позволит отображать
любое целочисленное значение в двоичном виде.
 */

public class ShowBitzDemo {

    public static void main(String[] args) {

        ShowBitz b = new ShowBitz(8);
        ShowBitz i = new ShowBitz(32);
        ShowBitz li = new ShowBitz(64);

        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87987 in binary: ");
        i.show(87987);

        System.out.println("\n237658768 in binary: ");
        li.show(237658768);

        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }
}
