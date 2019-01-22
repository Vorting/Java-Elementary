package homeWork.linkedList;

public interface LinkedList<E> {

    boolean add(E e);

    Object get(Object index);

    void remove(int index);

    boolean contains(E e);

    int size();

    boolean isEmpty();

    void clear();
}
