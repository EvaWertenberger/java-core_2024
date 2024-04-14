package lr3.RemovefromCol;

import java.util.*;

public class RemoveFromEnd {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println("Время удаления из конца ArrayList: " + removeFromEnd(arrayList));
        System.out.println("Время удаления из конца LinkedList: " + removeFromEnd(linkedList));
        System.out.println("Время удаления из конца LinkedHashMap: " + removeFromEndMap(linkedHashMap));
    }

    private static long removeFromEnd(List<Integer> list) {
        // Заполняем коллекцию элементами перед тестированием удаления.
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(list.size() - 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeFromEndMap(Map<Integer, Integer> map) {
        // Заполняем коллекцию элементами перед тестированием удаления.
        for (int i = 0; i < 10000; i++) {
            map.put(i, i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            map.remove(map.size() - 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
