package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12, n = 8, string = 0, sum_max = 0, sum;
        int[][] mas = new int[m][n];
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            sum = 0;
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(50);
                sum += mas[i][j];
            }
            if (sum_max < sum) {
                sum_max = sum;
                string = i;
            }
        }
        System.out.println(string);


    }
}
