package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        int minus = num - 1;
        int plus = num + 1;
        int power = (int) Math.pow(minus + plus + num, 2);

        System.out.println(minus + " " + num + " " + plus + " " + power);
        in.close();
    }
}
