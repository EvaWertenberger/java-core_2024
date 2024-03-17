package lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String encrypt = id.nextLine();
        System.out.println("Введите ключ: ");
        int shift = id.nextInt();
        String encrypted = getEncryptString(encrypt, shift);
        System.out.println("Текст после преобразования: " + encrypted);
        System.out.println("Выполнить обратное преобразование? (y/n)");

        while (true) {
            String flag = id.next();
            if (flag.equals("y")) {
                System.out.println(encrypt);
                break;
            }
            if (flag.equals("n")) {
                System.out.println("До свидания!");
                break;
            }
            else {
                System.out.println("Введите корректный ответ");
            }
        }
    }

    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);

        return encryptString;
    }
}
