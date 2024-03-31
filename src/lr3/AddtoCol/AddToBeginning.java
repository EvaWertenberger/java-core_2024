package lr3.AddtoCol;

import java.util.*;

public class AddToBeginning {
    public static void main(String[] args) {
        // Создаем экземпляры трех коллекций: ArrayList, LinkedHashMap, LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        // Измеряем время выполнения операции добавления в начало для ArrayList.
        System.out.println("Время добавления в начало ArrayList: " + addToBeginning(arrayList));
        // Измеряем время выполнения операции добавления в начало для LinkedList.
        System.out.println("Время добавления в начало LinkedList: " + addToBeginning(linkedList));
        // Измеряем время выполнения операции добавления в начало для LinkedHashMap.
        System.out.println("Время добавления в начало LinkedHashMap: " + addToBeginningMap(linkedHashMap));
    }
    // Методы для измерения времени выполнения операции добавления в начало коллекции.
    private static long addToBeginning(List<Integer> list) {
        // Фиксируем начальное время выполнения операции.
        long start = System.currentTimeMillis();
        // Добавляем элементы в начало коллекции.
        for (int i = 0; i < 6000000; i++) {
            list.add(0, i);
        }
        // Фиксируем конечное время выполнения операции.
        long end = System.currentTimeMillis();
        // Возвращаем затраченное время.
        return end - start;
    }
    private static long addToBeginningMap(Map<Integer, Integer> map) {
    // Фиксируем начальное время выполнения операции.
        long start = System.currentTimeMillis();
    // Добавляем элементы в начало коллекции.
        for (int i = 0; i < 6000000; i++) {
            map.put(0, i);
        }
    // Фиксируем конечное время выполнения операции.
        long end = System.currentTimeMillis();
    // Возвращаем затраченное время.
        return end - start;
    }
}
