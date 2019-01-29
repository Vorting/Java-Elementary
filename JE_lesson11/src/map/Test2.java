package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>(); //внутри не гарантируется никакого порядка

        // в каком порядке пары (ключ, значения) были добавлены, в таком они и вернутся
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        Map<Integer, String> treeMap = new TreeMap<>(); // пары (ключ, значения) сортируются по ключу(естественный порядок)
        System.out.println("hashMap example: ");
        tesMap(hashMap);

        System.out.println("linkedHashMap example: ");
        tesMap(linkedHashMap);

        System.out.println("treeMap example: ");
        tesMap(treeMap);
    }

    public static void tesMap(Map<Integer, String> map) {
        map.put(28, "Roman");
        map.put(26, "Dima");
        map.put(33, "Vova");
        map.put(0, "Yura");
        map.put(1500, "Artem");
        map.put(7, "test Blob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-----------------");
    }
}
