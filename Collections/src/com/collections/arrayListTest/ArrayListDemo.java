package com.collections.arrayListTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); //по конвенции переименовываем в List
        // если понадобится менять реализацию на ходу

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//        System.out.println(arrayList);
//============================================================================
//        for (int i = 0; i <arrayList.size() ; i++) { // выводим каждый элемент
//            System.out.println(arrayList.get(i)); // списка на экран
//        }
//============================================================================
//        System.out.println("\nSecond time call\n");
//        for (Integer x:arrayList) {
//            System.out.println(x);
//        }

//============================================================================
//        System.out.println("get " + "first element:\t" + arrayList.get(0));
//        System.out.println("get " + "last element:\t" + arrayList.get(99));
//
//        System.out.println("size of arrayList:\t" + arrayList.size());
//============================================================================
        list.remove(5); // [1,2,3,4,5]
        System.out.println(list);

//        // если проводим много удалений из нашего листа
//        list = new LinkedList<>();
    }
}
