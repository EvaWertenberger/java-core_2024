package lr3.AddtoCol;

import java.util.*;

public class AddToEnd {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println("Время добавления в конец ArrayList: " + addToEnd(arrayList));
        System.out.println("Время добавления в конец LinkedList: " + addToEnd(linkedList));
        System.out.println("Время добавления в конец LinkedHashMap: " + addToEndMap(linkedHashMap));
    }
    private static long addToEnd(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 6000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long addToEndMap(Map<Integer, Integer> map) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 6000000; i++) {
            map.put(i, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
