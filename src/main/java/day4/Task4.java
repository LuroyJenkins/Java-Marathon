package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        Random rand = new Random();
        int sum_three_max = 0, first_num_three = 0, current_sum;

        for (int i = 0; i < mas.length; i++) {  // заполняем массив
            mas[i] = rand.nextInt(10000);
        }

        for (int i = 1; i < mas.length - 1; i++) {
            current_sum = 0;
            //int current_sum = mas[i-1]+mas[i]+mas[i+1];
            for (int j = 0; j < 3; j++) {
                current_sum += mas[i-1+j];
            }
            if (current_sum > sum_three_max) {
                sum_three_max = current_sum;
                first_num_three = i - 1;
            }
        }

        System.out.println(sum_three_max);
        System.out.println(first_num_three);
    }
}
