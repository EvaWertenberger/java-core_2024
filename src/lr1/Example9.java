package lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней: ");
        int numdays = in.nextInt();

        System.out.println("В месяце " + month + " " + numdays + " день");
        in.close();
    }
}
