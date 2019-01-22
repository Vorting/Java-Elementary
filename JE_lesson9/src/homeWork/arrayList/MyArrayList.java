package homeWork.arrayList;

/* добавление-add (E e), удаление-remove( Object o),
проверка наличия- contains (Object o), получение колличества-size,
 проверка на пустоту- isEmpty(), очистка- clear().
 */
public class MyArrayList<E> implements ListMethods<E> {

    private Object[] someArray = new Object[10];
    private int size = 0;

    @Override
    public boolean add(E e) {
        if (size >= someArray.length) {
            resize();
        }
        someArray[size++] = e;
        return true;
    }

    private void resize() {
        int newSize = (someArray.length * 3) / 2 + 1; //расширяем массив
        System.out.println("newSize: " + newSize);
        Object[] newArr = new Object[newSize];
        for (int i = 0; i < someArray.length; i++) {
            newArr[i] = someArray[i];
        }
        someArray = newArr;
    }

    @Override
    public boolean remove(E e) {
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] == e) {
                Object[] tmpArray = someArray;
                someArray = new Object[someArray.length - 1];
                System.arraycopy(tmpArray, 0, someArray, 0, i);
                System.arraycopy(tmpArray, i + 1, someArray, i, tmpArray.length - i - 1);
            }
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        someArray = new Object[10];
        size = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < someArray.length; i++) {
            sb.append(someArray[i]);
            if (i != someArray.length - 1) {
                sb.append(", ");
            }
        }
        return "[" + sb.toString() + "]";
    }
}
