package com.homework2v3;

public class IntLinkedList implements IntList {// implements это ключевое слово,
    // предназначенное для реализации интерфейса (interface)

    private int size = 0;
    private Entry first;
    private Entry last;

    @Override
    public void add(int value) {
        Entry newEntry = new Entry(value);
        if (first == null) {
            first = newEntry;
            last = newEntry;
        } else {
            //добавляем новый элемент в конец
            last.next = newEntry;
            newEntry.previous = last;
            last = newEntry;
        }
        size++;
    }

    @Override
    public void add(int value, int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        Entry newEntry = new Entry(value);
        if (index ==0){
            first.previous=newEntry; //добавляем в начало
            newEntry.next=first;
            first=newEntry;
            size++;
            return;
        }
        if (index==size-1){
            last.next=newEntry;
            newEntry.previous=last;
            last=newEntry;
            size++;
            return;
        }
        Entry oldEntry = first;
        for (int i = 0; i < index; i++) {
            oldEntry = oldEntry.next;
        }
        Entry oldPrevious = oldEntry.previous;
        oldEntry.next = newEntry;
        oldEntry.previous = newEntry;
        newEntry.previous = oldPrevious;
        newEntry.next = oldEntry;
        size++;
    }

    @Override
    public void remove(int i) {
    }
    
    public int count() {
        return count();
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
        return 0;
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
            this.value = value;
        }
    }
}
