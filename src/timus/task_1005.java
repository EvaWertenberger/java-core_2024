package timus;
import java.util.Scanner;
public class task_1005 {
    public static void main(String str[]) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int weights[] = new int[n];

        for (int i = 0; i < n; i++)
            weights[i] = input.nextInt();

        int difference = Integer.MAX_VALUE;
        for (int c = 0; c < 1 << n; c++) {
            int firstHeap = 0;
            int secondHeap = 0;
            int k = c;

            for (int i = 0; i < n; i++) {
                if ((k & 1) > 0)
                    firstHeap += weights[i];
                else
                    secondHeap += weights[i];

                k >>= 1;
            }
            difference = Math.min(difference, Math.abs(firstHeap - secondHeap));
        }

        System.out.println(difference);
        input.close();
    }
}
