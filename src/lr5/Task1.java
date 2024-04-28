package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список " +
                "строк и возвращает новый список, содержащий только те строки, " +
                "которые содержат заданную подстроку.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитирования : " + "\n");
        for(String e: strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterSubStrings(strings, "рок");

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for(String e: stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterSubStrings(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
