package lr2;

public class Task2 {
    public static void main(String[] args) {
        int rows = 5; // строки массива
        int cols = 6; // столбцы массива
        int[][] array2d = new int[rows][cols];
        int count = 1; //счетчик заполнения массива

        for (int i = 0; i < rows; i++) {
            if (i%2 == 0) { //четные строки слева-направо
                for (int j = 0; j < cols; j++) {
                    array2d[i][j] = count;
                    count++;
                }
            } else { //нечетные строки справа-налево
                for (int j = cols -1; j >= 0; j--) {
                    array2d[i][j] = count;
                    count++;
                }
            }
        }
        System.out.println("Полученный массив: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array2d[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
