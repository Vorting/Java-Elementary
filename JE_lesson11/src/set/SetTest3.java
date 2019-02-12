package set;

import java.util.HashSet;
import java.util.Set;

public class SetTest3 {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Множество 1: "+set1);

        Set<Integer> set2 = new HashSet<>();

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        System.out.println("Множество 2: "+set2);

        // union - обьединение множеств
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.print("Объеденение множеств 1 и 2: ");
        System.out.println(union);

        //  intersection -пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.print("Пересечение множеств 1 и 2: ");
        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.print("Разность множеств 1 и 2: ");
        System.out.println(difference);

    }
}
