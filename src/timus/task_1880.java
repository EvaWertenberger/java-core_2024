package timus;


import java.io.*;
import java.util.Arrays;

public class task_1880 {
    public static void main(String[] args) throws IOException {

        String inputTask = "src/timus/input_task_1880.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
            oj ? new BufferedReader(new InputStreamReader(System.in)) :
                    new BufferedReader(new FileReader(inputTask));

        int amountFirstStr = Integer.parseInt(bufferedReader.readLine());
        String[] firstString = bufferedReader.readLine().split(" ");

        int amountSecondStr = Integer.parseInt(bufferedReader.readLine());
        String[] secondString = bufferedReader.readLine().split(" ");

        int amountThirdStr = Integer.parseInt(bufferedReader.readLine());
        String[] thirdString = bufferedReader.readLine().split(" ");

        int sumSize = amountFirstStr + amountSecondStr + amountThirdStr;
        String[] combine = new String[sumSize];

        for(int i = 0, k = 0, l = 0; i < sumSize; i++){
            if(i < amountFirstStr){
                combine[i] = firstString[i];
                continue;
            }
            if (i < (amountFirstStr + amountSecondStr)){
                combine[i] = secondString[k];
                k++;
                continue;
            }
            combine[i] = thirdString[l];
            l++;
        }
        Arrays.sort(combine);

        int count = 0;

        for(int i = 1; i < combine.length - 1; i++){
            if(combine[i - 1].equals(combine[i]) && combine[i].equals(combine[i + 1])){
                count++;
            }


        }

        System.out.print(count);
    }
}
