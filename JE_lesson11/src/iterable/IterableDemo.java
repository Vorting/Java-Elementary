package iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterableDemo {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int someIdx = 0;

        // Before Java 5
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (someIdx == 1) {
                iterator.remove();
            }
            someIdx++;
        }
        System.out.println(list);

//        // Java 5
//        for (int x : list) {
//            list.remove(1);
//            System.out.println(x);
//        }
    }
}
