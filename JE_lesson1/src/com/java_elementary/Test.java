package com.java_elementary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();

//        for (int i = 0; i < 10; i++) {
//            arrayList.add(i);
//        }

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
//===================================================
//        System.out.println(arrayList + " \n ");
//
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(99));
//
//        System.out.println(arrayList.size());
//===================================================
//===================================================
//        for (int i=0; i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
//
//        for (Integer x:arrayList) {
//            System.out.println(x);
//        }
//====================================================
//        arrayList.remove(5);
//        System.out.println(arrayList);
//====================================================

        //мы проводим много удалений из нашего листа
        list=new LinkedList<Integer>();


    }
}
