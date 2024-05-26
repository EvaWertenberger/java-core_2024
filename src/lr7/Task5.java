package lr7;
import java.io.*;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) throws IOException {
        // Читаем название файла
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String fileName = in.nextLine();
        // Выводим размер файла в байтах
        File file = new File(fileName);
        long fileSizeInBytes = file.length();
        System.out.println("Размер файла равен: " + fileSizeInBytes + " байт");
    }
}
