package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк " +
                "и возвращает новый список, содержащий только те строки, " +
                "которые имеют длину больше заданного значения.";

        List<String> strings = List.of(string.split(","));
        System.out.println("\n" + "Строка после сплитирования : " + "\n");
        for(String e: strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterStringsByLength(strings, 40);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for(String e: stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsByLength(List<String> list, int len) {
        return list.stream()
                .filter(s -> s.length()>len)
                .collect(Collectors.toList());
    }
}
