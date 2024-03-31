package lr3.CollectionsMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsEx {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Tiger");
        System.out.println("Исходный список: " + animals);
        Collections.sort(animals); // Сортировка списка
        System.out.println("Отсортированный список: " + animals);
        System.out.println("Количество элементов: " + animals.size());
        System.out.println("Список пустой? " + animals.isEmpty());
    }
}
