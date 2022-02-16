package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        Random rand = new Random();
        int max = 0, min = 0, zeros = 0, sum_zeros = 0;

        for (int i=0;i<mas.length;i++) {
            mas[i] = rand.nextInt(10000);
        }

        for (int Mas : mas) {
            if (Mas > max) max = Mas;
            if (Mas < min) min = Mas;
            if (Mas % 10 == 0) {
                zeros++;
                sum_zeros += Mas;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + zeros);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum_zeros);
    }
}
