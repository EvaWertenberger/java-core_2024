package timus;

import java.util.Scanner;

public class task_1209 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long binary = in.nextLong();

        for(long i = 0; i < binary; i++){
            long k = in.nextLong() - 1;

            long square = (long) Math.sqrt(8 * k + 1);

            if(square * square == (8 * k + 1)){
                System.out.println("1 ");
            } else{
                System.out.println("0");

            }
        }
    }
}
