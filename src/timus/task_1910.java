package timus;

import java.io.*;
import java.util.Arrays;

public class task_1910 {
    public static void main(String[] args) throws IOException {

        String inputTask = "src/timus/input_task_1910.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputTask));

        PrintWriter out = new PrintWriter(System.out);


        int numberOfDoors = Integer.parseInt(bufferedReader.readLine());

        String[] doors = bufferedReader.readLine().split(" ");

        int[] sumArray = new int[numberOfDoors - 2];

        for(int i = 0; i < sumArray.length; i++){
            sumArray[i] = Integer.parseInt(doors[i]) + Integer.parseInt(doors[i + 1]) +
                    Integer.parseInt(doors[i + 2]);

        }

        int[] newArray = Arrays.copyOf(sumArray, sumArray.length);
        Arrays.sort(sumArray);

        int maxValue = sumArray[sumArray.length - 1];

        for(int i = 0; i < sumArray.length; i++){
            if(newArray[i] == maxValue){
                out.println(maxValue + " " + (i + 2));
                break;
            }

        }

        out.flush();

    }
}
