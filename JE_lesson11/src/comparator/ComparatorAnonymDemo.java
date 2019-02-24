package comparator;
/*
Пишем реализацию с помощью анонимных классов
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAnonymDemo {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        animals.add("asdfg");
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("ab");
        animals.add("bird");
        animals.add("a");

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(animals);

        numbers.add(5);
        numbers.add(0);
        numbers.add(666);
        numbers.add(500);
        numbers.add(100);
        numbers.add(-32);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);
    }
}
