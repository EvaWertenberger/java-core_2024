package lr4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        byte testArray[] = new byte[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< testArray.length; i++) {
            System.out.printf("Введите byte-число номер %s из 5\n", i+1);
            try {
                byte num = Byte.parseByte(scanner.nextLine());
                testArray[i] = num;
            } catch (NumberFormatException n) {
                System.out.println("Тип не соответствует!");
                i--;
            }
        }
        int res = 0;
        for (byte b : testArray) {
            res += b;
        }
        System.out.printf("Сумма - %s", res);
    }
}
