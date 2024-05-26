package lr7.Task08;

import java.io.*;
public class Task8 {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Ева", 22);
        // Запись в файл
        FileOutputStream output = new FileOutputStream("src/lr7/task8/person.txt");
        ObjectOutputStream objOut = new ObjectOutputStream(output);
        objOut.writeObject(person);
        System.out.println("Сериализованные данные сохранены в файл");
        objOut.flush();
        objOut.close();
        // Чтение из файла
        FileInputStream input = new FileInputStream("src/lr7/task8/person.txt");
        ObjectInputStream objIn = new ObjectInputStream(input);
        Person serPerson = (Person) objIn.readObject();
        System.out.println("Данные восстановлены из файла");
        // Вывод значений полей на экран
        System.out.println("Имя: " + serPerson.getName());
        System.out.println("Возраст " + serPerson.getAge());
        objIn.close();

    }
}

