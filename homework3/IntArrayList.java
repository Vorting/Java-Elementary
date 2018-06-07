package com.homework3;

public class IntArrayList implements IntList {// implements это ключевое слово,
    // предназначенное для реализации интерфейса (interface)

    private int[] arr = new int[10];//создаем вспомогательный массив на 10 элементов\
    private int size = 0;
    private int count = 0;

    @Override
    public void add(int value) {
        if (size >= arr.length) {
            resize();
        }
        arr[size] = value;// увеличиваем size на 1, при каждом вызове
        size++;
    }

    private void resize() {//пересоздаем массив с помощью метода resize
        int newSize = arr.length * 3 / 2 + 1;
//        System.out.println("newSize:" + newSize);
        int[] newArr = new int[newSize];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        count++;
    }

    @Override //@Override ключевое слово,
    // которое позволяет в дочернем классе заново создать реализацию метода родительского класса.
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return arr[index];
    }

    @Override
    public int size() {

        return size;
    }

    public int count() {

        return count;
    }

    @Override
    public void add(int element, int index) {

    }

    @Override
    public void remove(int i) {

    }

    @Override
    public String toString() { // с помощью метода toString
        // преобразуем для нормального вывода в консоль
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
