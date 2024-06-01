package timus;

import java.util.Locale;
import java.util.Scanner;

public class task_1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int candidates = Integer.parseInt(input[0]);
        int voters = Integer.parseInt(input[1]);

        int[] votes = new int[candidates];

        for (int i = 0; i < voters; i++) {
            int candidate = scanner.nextInt();
            votes[candidate - 1]++;
        }

        Locale.setDefault(Locale.ENGLISH);
        scanner.close();
        for (int i = 0; i < candidates; i++) {
            double percentage = (double) votes[i] / voters * 100;
            System.out.printf("%.2f%%" + (i == candidates - 1 ? "" : "\n"), percentage);
        }
    }
}
