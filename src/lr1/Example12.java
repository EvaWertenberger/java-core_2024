package lr1;
import java.util.Scanner;
import java.time.Year;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        int cur_year = Year.now().getValue();
        int birthyear = cur_year - age;

        System.out.println("Ваш год рождения " + birthyear);
        in.close();
    }
}
