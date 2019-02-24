package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
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

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        numbers.add(5);
        numbers.add(0);
        numbers.add(666);
        numbers.add(500);
        numbers.add(100);
        numbers.add(-32);

        Collections.sort(numbers, new BackwardsIntegerComparator());
        System.out.println(numbers);
    }

    static class StringLengthComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            /*
            o1 > 02 => 1;
            o1 < o2 = -1;
            o1 == o2 => 0;

            compare(2,1) =>1;
            compare(1,2) =>-1;
            compare(1,1) =>0;
             */

            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    static class BackwardsIntegerComparator implements Comparator<Integer> {

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
    }
}
