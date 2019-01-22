package com.arrayList;
/* Задача. Реализовать свой класс ArrayList
 расширяющий интерфейс List (реализовать только основные методы, если будет время, то реализовать остальные)
 */

public class Main {

    public static void main(String[] args) {

//        List<?> MyArrayList = new MyArrayList<>();
        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");
        myList.add("fourth");
        myList.add("fifth");
        myList.add("sixth");
        myList.add("seventh");
        myList.add("eighth");
        myList.add("ninth");
        myList.add("tenth");

        System.out.printf("MyArrayList has %d elements \n", myList.size());
        System.out.println(myList.remove("tenth"));
        System.out.println(myList.remove("fourth"));
        System.out.println(myList.remove("first"));
        System.out.println(myList.remove("third"));
        System.out.println();
        System.out.printf("Now,MyArrayList has %d elements \n", myList.size());
        System.out.println(myList.contains("eleventh"));

    myList.toString();



    }
}
