package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Qzwqwe");
        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");
        hashSet.add("Tom");
        hashSet.add("Tom");

        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));
        System.out.println(hashSet.isEmpty());

        for (String name : hashSet) {
            System.out.println(name);
        }
        System.out.println(hashSet);


    }
}
