package linkedList;

public interface LinkedList<E> {

    boolean add(E e);

    Object get(Object index);

    void remove(E index);

    boolean contains(E e);

    int size();

    boolean isEmpty();

    void clear();
}
