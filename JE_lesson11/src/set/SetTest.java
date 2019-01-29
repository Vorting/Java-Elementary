package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Dima");
        hashSet.add("Dasha");
        hashSet.add("Kostya");
        hashSet.add("Gena");
        hashSet.add("Denis");

        linkedHashSet.add("Dima");
        linkedHashSet.add("Dasha");
        linkedHashSet.add("Kostya");
        linkedHashSet.add("Gena");
        linkedHashSet.add("Denis");

        treeSet.add("Dima");
        treeSet.add("Dasha");
        treeSet.add("Kostya");
        treeSet.add("Gena");
        treeSet.add("Denis");

        System.out.println("hashSet:");
        for (String name : hashSet) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("linkedHashSet:");
        for (String name : linkedHashSet) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("treeSet:");
        for (String name : treeSet) {
            System.out.println(name);
        }

    }
}

