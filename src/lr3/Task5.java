package lr3;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Ноль");
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыре");
        map.put(5, "Пять");
        map.put(6, "Шесть");
        map.put(7, "Семь");
        map.put(8, "Восемь");
        map.put(9, "Девять");
        map.put(10, "Десять");
        // Поиск строк с ключами > 5
        System.out.println("Строки с ключами > 5:");
        for (Integer key : map.keySet()) {
            if (key > 5) {
                System.out.println("Ключ: " + key + ", Значение: " +
                        map.get(key));
            }
        }
        // Вывод строк с ключом 0 через запятую
        if (map.containsKey(0)) {
            System.out.println("Строки с ключом 0: " + String.join(", ",
                    map.get(0)));
        }
        // Перемножаем ключи, где длина строки > 5
        int product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product  *= entry.getKey();
            }
        }
        // Выводим результат перемножения
        System.out.println("Результат перемножения ключей: " + product);
    }

}
