package lr3.RemovefromCol;

import java.util.*;

public class RemoveFromMiddle {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println("Время удаления из середины ArrayList: " + removeFromMiddle(arrayList));
        System.out.println("Время удаления из середины LinkedList: " + removeFromMiddle(linkedList));
        System.out.println("Время удаления из середины LinkedHashMap: " + removeFromMiddleMap(linkedHashMap));
    }
    private static long removeFromMiddle(List<Integer> list) {
        // Заполняем коллекцию элементами перед тестированием удаления.
        for (int i = 0; i < 6000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 6000000; i++) {
            list.remove(list.size()/2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long removeFromMiddleMap(Map<Integer, Integer> map) {
        // Заполняем коллекцию элементами перед тестированием удаления.
        for (int i = 0; i < 6000000; i++) {
            map.put(i,i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 6000000; i++) {
            map.remove(map.size() / 2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
