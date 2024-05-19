package lr6;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        Random random = new Random();
        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt(200);
        }
        System.out.println("Максимальный элемент " + findMaxElem(array));
    }

    public static int findMaxElem(int[] array) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        int partArray = array.length / numThreads;
        MaxElem[] threads = new MaxElem[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MaxElem(array, i * partArray, (i + 1) *
                    partArray);
            threads[i].start();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
                max = Math.max(max, threads[i].getMax());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return max;
    }
    static class MaxElem extends Thread {
        private int[] array;
        private int startIndex;
        private int endIndex;
        private int max = Integer.MIN_VALUE;
        public MaxElem(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                max = Math.max(max, array[i]);
            }
        }
        public int getMax() {
            return max;
        }
    }
}
