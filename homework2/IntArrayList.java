package com.homework2;

// реализуем интерефейс с помощью ключевого слова implements
//для указания методов
public class IntArrayList implements IntList {
    private int[] array = new int[10];
    private int size = 0;

    @Override // с помощью @Override заново создаем реализацию
    // метода родительского класса
    public void add(int value) {
        if (size >= array.length) {
            resize();
        }
        array[size] = value;
        size++;
    }

    @Override
    public void add(int value, int index) {

    }

    private void resize() {
        int newSize = array.length * 3 / 2 + 1; //расширяем массив
        System.out.println("newSize: " + newSize);
        int[] newArray = new int[newSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder string_builder = new StringBuilder();
        string_builder.append("[");
        for (int i = 0; i < size; i++) {
            string_builder.append(array[i]).append(",");
        }
        string_builder.append("]");
        return string_builder.toString();
    }

    private static class Entry {
        int value;
        Entry next;
        Entry previous;

        public Entry(int Value) {
            this.value = value;
        }
    }

}
