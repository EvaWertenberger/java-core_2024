package lr3.SearchbyIndex;

import java.util.*;

public class GetAtRandomIndex {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println("Время получения по случайному индексу из ArrayList: " + getAtRandomIndex(arrayList));
        System.out.println("Время получения по случайному индексу из LinkedList: " + getAtRandomIndex(linkedList));
        System.out.println("Время получения по случайному индексу из LinkedHashMap: " + getAtRandomIndexMap(linkedHashMap));
    }
    private static long getAtRandomIndex(List<Integer> list) {
        // Заполняем коллекцию элементами перед тестированием получения по индексу.
        for (int i = 0; i < 1000000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(list.size());
            int element = list.get(randomIndex);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getAtRandomIndexMap(Map<Integer,Integer> map) {
        // Заполняем коллекцию элементами перед тестированием получения по индексу.
        for (int i = 0; i < 1000000000; i++) {
            map.put(i,i);
        }
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(map.size());
            int element = map.get(randomIndex);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
