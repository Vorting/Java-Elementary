package com.homework3;
/* 1.Сравнить быстродействие классов  IntArrayList и IntLinkedList
по следующим параметрам:
- get() из средины списка;
- add() в конец / в начало / в средину;
- remove() в начале списка / в средине;
2. Сколько раз вызывается операция resize() в IntArrayList при формуле  `newSize = size * 3 / 2 + 1`для:
 1'000, 1'000'000, 1'000'000'000 добавлений в конец?
 3. Чем отличается интерфейс от абстрактного класса? Когда какой применять?
*/

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        IntList list = new IntArrayList();
//      IntList list = new IntLinkedList();

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(100));
        }
//        System.out.println("List: " + list);
//        list.add(55, 2);
//        System.out.println("List: " + list);

        long time = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
//            int value =list.get(COUNT/2);
//             list.remove(100000/2);
//            System.out.println("Value: " + value);
        }

        long timeDiff = System.currentTimeMillis() - time;
        double seconds = timeDiff / 1000.0;
//        System.out.println("Time: "+ seconds);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println("№ of calls: " + list.count());
    }
}