package lr1;
import java.util.Scanner;
import java.time.Year;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String firstname = in.nextLine();

        System.out.println("Введите год рождения: ");
        int year = in.nextInt();
        int cur_year = Year.now().getValue();
        int age = cur_year - year;

        System.out.println("Пользователь " + firstname + " имеет возраст " + age);
        in.close();
    }
}
