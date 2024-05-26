package lr7;
import java.io.*;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = in.nextLine();
        System.out.print("Введите текст для записи в файл: ");
        String text = in.nextLine();
        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(fileName))) {
            writer.write(text);
            writer.close();
            System.out.println("Количество записанных символов: " + text.length());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файла: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}
