package com.collections.MyLinkedList;

import java.util.Arrays;

public class MyLinkedList {

    private Node head;
    private int size;

    public void add(int value) {
        // if it a first add to list
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(value));
        }


        size++;
    }

    public int get(int index) {
        int currentIndex = 0;
        Node tmp = head;

        while (tmp != null) {
            if (currentIndex == index) {
                return tmp.getValue();
            } else {
                tmp = tmp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        int currentIndex = 0;
        Node tmp = head;

        while (tmp != null) {
            if (currentIndex  == index-1) {
                tmp.setNext(tmp.getNext().getNext());
                size--;
                return;
            } else
                tmp = tmp.getNext();
            currentIndex++;
        }
    }

    @Override
    public String toString() {
        int[] result = new int[size];
        int index = 0;
        Node tmp = head;

        while (tmp != null) {
            result[index++] = tmp.getValue();
            tmp = tmp.getNext();
        }
        return Arrays.toString(result);
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

}
