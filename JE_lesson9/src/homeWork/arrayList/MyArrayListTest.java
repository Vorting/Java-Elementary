package homeWork.arrayList;
/* Задача. Реализовать свой класс ArrayList
 расширяющий интерфейс List (реализовать только основные методы, если будет время, то реализовать остальные)
 */

public class MyArrayListTest {

    public static void main(String[] args) {

        MyArrayList<Integer> myList = new MyArrayList<>();

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        System.out.println("list of elements:");
        System.out.println(myList);

        System.out.println("size of my list: \t" + myList.size());

        myList.remove(2);

        System.out.println(myList.toString());
        System.out.println(myList.contains(2) );
        System.out.println("Is my list empty? ");
        System.out.println(myList.isEmpty());
    }
}
