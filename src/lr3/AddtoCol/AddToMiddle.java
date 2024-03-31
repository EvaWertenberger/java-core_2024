package lr3.AddtoCol;

import java.util.*;

public class AddToMiddle {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println("Время добавления в середину ArrayList: " + addToMiddle(arrayList));
        System.out.println("Время добавления в середину LinkedList: " + addToMiddle(linkedList));
        System.out.println("Время добавления в середину LinkedHashMap: " + addToMiddleMap(linkedHashMap));
    }
    private static long addToMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 6000000; i++) {
            list.add(list.size() / 2, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long addToMiddleMap(Map<Integer, Integer> map) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 6000000; i++) {
            map.put(map.size() / 2, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
