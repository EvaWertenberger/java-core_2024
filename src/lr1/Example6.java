package lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String lastname = in.nextLine();

        System.out.println("Введите имя: ");
        String firstname = in.nextLine();

        System.out.println("Введите отчество: ");
        String middlename = in.nextLine();

        System.out.println("Привет " + lastname + " " + firstname + " " + middlename);
        in.close();
    }
}
