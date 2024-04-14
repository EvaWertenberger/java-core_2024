package lr4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 4;
        int[][] testArray = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                testArray[i][j] = random.nextInt(50);
            }
        }
        System.out.println("Для завершения программы введите - stop");
        System.out.println("Введите номера столбцов для вывода элементов: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext(Pattern.compile("stop"))) {
            try {
                int index = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < rows; i++) {
                    System.out.print(testArray[i][index] + " ");
                }
                System.out.println();
            }
            catch (NumberFormatException n) {
                System.out.println("Ввод строки вместо числа!");
            }
            catch (IndexOutOfBoundsException i) {
                System.out.println("Нет столбца с таким номером!");
            }
        }
    }
}
