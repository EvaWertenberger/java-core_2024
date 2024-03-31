package lr3.CollectionsMap;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Dog", 7);
        ages.put("Bird", 1);
        ages.put("Cat", 5);
        ages.put("Lion", 10);
        ages.put("Tiger", 8);
        System.out.println("Возраст: " + ages);
        int dogAge = ages.get("Dog");
        System.out.println("Возраст собаки: " + dogAge);
        boolean containsKey = ages.containsKey("Bird");
        boolean containsValue = ages.containsValue(100);
        System.out.println("Отображение содержит ключ 'Bird'? " + containsKey);
        System.out.println("Отображение содержит значение 100? " + containsValue);
        ages.remove("Lion");
        System.out.println("Возраст после удаления записи: " + ages);
        System.out.println("Количество записей: " + ages.size());
    }
}
