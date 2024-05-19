package lr6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[1000000];
        Random random = new Random();
        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt(200);
        }
        System.out.println("Сумма элементов массива " + sumElements(array));
    }

    public static long sumElements(int[] array) throws InterruptedException {
        int numThreads = Runtime.getRuntime().availableProcessors();
        int partArray = array.length / numThreads;
        SumElem[] threads = new SumElem[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new SumElem(array, i * partArray, (i + 1) *
                    partArray - 1);
            threads[i].start();
        }
        long arraySum = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
                arraySum += threads[i].getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return arraySum;
    }
    static class SumElem extends Thread {
        private int[] array;
        private int startIndex;
        private int endIndex;
        private long sum;
        public SumElem(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.sum = 0;
        }
        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                sum += array[i];
            }
        }
        public long getSum() {
            return sum;
        }
    }
}
