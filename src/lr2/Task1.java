package lr2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите размер массива ");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        Random random = new Random();

        //Заполнение массива случайными числами от 0 до 499:
        for (int i =0; i<nums.length; i++){
            nums[i] = random.nextInt(500);
        }
        System.out.println("Созданный массив: " + Arrays.toString(nums));

        int min = nums[0];
        ArrayList<Integer> minIndex = new ArrayList<>();

        //Поиск минимальных элементов:
        for (int i =0; i<nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex.clear();
                minIndex.add(i);
            } else if (nums[i] == min) {
                minIndex.add(i);
            }
        }
        System.out.println("Минимальное значение: " + min);
        for (int i : minIndex) {
            System.out.println("Индекс минимального значения: " + i);
        }
    }
}

