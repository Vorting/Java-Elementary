package homeWork.linkedList;


import java.util.Arrays;

public class MyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private int size = 0;

    @Override
    public boolean add(E e) {

        // if it`s a first e add to list
        if (head == null) {
            this.head = new Node(e);
        } else {
            Node tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            // [1] -> [2] -> p[3]

            tmp.setNext(new Node(e));
        }
        size++;
        return true;
    }


    @Override
    public Object get(Object index) {
        Integer currentIndex = 0;
        Node tmp = head;
        while (head != null) {
            if (currentIndex == index) {
                return tmp.getValue();
            } else {
                tmp = tmp.getNext();
                currentIndex++; //под вопросом
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        Object[] result = new Object[size];
        int index = 0;
        Node temp = head;

        while (temp != null) { //проходимся по всему списку пока tmp !=null
            result[index++] = temp.getValue();
            temp = temp.getNext(); //
        }
        return Arrays.toString(result);
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        int currentIndex = 0;
        Node tmp = head;
        while (tmp != null) {
            if (currentIndex == index - 1) {
                tmp.setNext(tmp.getNext().getNext());
                size--;
                return;
            } else {
                tmp = tmp.getNext();
                currentIndex++;
            }
        }
    }

    @Override
    public boolean contains(E index) {
        Integer currentIndex = 0;
        Node tmp = head;
//        while (tmp!=index) {
        if (currentIndex.equals(index)) {
            return true;
        } else {
            tmp = tmp.getNext();
            currentIndex++;
        }
//        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    private static class Node {
        private Object value;
        private Node next;

        public Node(Object value) {
            this.value = value;
        }

        public Object getValue() {
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
