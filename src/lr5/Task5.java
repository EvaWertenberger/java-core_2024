package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        String string = "Напишите функцию, котор8ая принимает: на вход/ список строк " +
                "и 23возвращает новый *список, содержащий! только те строки, " +
                "которые содер&жат только бук?вы (без цифр и символов).";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитирования : " + "\n");
        for(String e: strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterStringsByLetters(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for(String e: stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsByLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-яёЁ]+"))
                .collect(Collectors.toList());
    }
}
