package com.homework2;
/*Создать интерфейс IntList с методами: add(int element),
add (int index, int element), clear(), contains  int value),
get(int index), isEmpty(), remove(int index), removeElement(int element),
set(int index, int element), size(). И 2 его реализации
- IntArrayList и IntLinkedList по аналогии с
ArrayList<Integer> и LinkedList<Integer>.
 */

import java.util.Random;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        IntList list = new IntArrayList();
        //создаем переменную для генерирования
        // случайных чисел
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ";");
        }
    }
}
