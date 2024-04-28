package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до :" + "\n");
        for (int i = 0; i< 10; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterDividers(integers, 3);

        System.out.println("\n" + "Список чисел, делящихся на 3 без остатка : " + "\n");
        for (Integer i: integersAfter){
            System.out.println(i);
        }
    }

    public static List<Integer> filterDividers(List<Integer> list, int number) {
        return list.stream()
                .filter(x -> x % number == 0)
                .collect(Collectors.toList());
    }
}
