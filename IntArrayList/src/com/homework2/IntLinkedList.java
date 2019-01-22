package com.homework2;

public class IntLinkedList implements IntList {
    private int size = 0;
    private Entry first;
    private Entry last;

    @Override
    public void add(int value) {
        Entry new_Entry = new Entry(value);
        if (first == null) {
            first = new_Entry;
            last = new_Entry;
        } else { //проход по всем значениям
            last.next = new_Entry;
            new_Entry.previous = last;
            last = new_Entry;
        }
        size++;
    }

    @Override
    public void add(int value, int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        Entry newEntry = new Entry(value);

        if (index == 0) {
            // TODO implement
        }

        if (index == size - 1) {
            // TODO implement
        }

        Entry oldEntry = first;
        for (int i = 0; i < index; i++) {
            oldEntry = oldEntry.next;
        }

        Entry oldPrevious = oldEntry.previous;
        oldPrevious.next = newEntry;
        oldEntry.previous = newEntry;

        newEntry.previous = oldPrevious;
        newEntry.next = oldEntry;

        size++;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        Entry result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(get(i)).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    private static class Entry {
        int value;
        Entry next;
        Entry previous;

        public Entry(int value) {
            this.value = value;//обращаемся к переменным  класса с помощью this
        }
    }
}
