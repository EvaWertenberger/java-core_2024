package lr2;

import java.util.Scanner;

public class Task4 {
    private String name;
    private int age;
    private String gender;

    public Task4(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //Пример использования
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = id.nextLine();

        System.out.println("Введите возраст: ");
        int age = id.nextInt();
        id.nextLine();

        System.out.println("Введите пол: ");
        String gender = id.nextLine();

        Task4 person = new Task4(name, age, gender);

        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Пол: " + person.getGender());

        person.setAge(22);
        System.out.println("Новый возраст: " + person.getAge());
    }
}
