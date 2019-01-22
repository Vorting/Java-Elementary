package com.je_lesson9;

import javax.lang.model.element.Element;

/* добавление-add (E e), удаление-remove( Object o),
проверка наличия- contains (Object o), получение колличества-size,
 проверка на пустоту- isEmpty(), очистка- clear().
 */
public interface ListMethods<E> {

    boolean add(E e);

    boolean remove(E e);

    boolean contains(E e);

    int size();

    boolean isEmpty();

    void clear();

}
