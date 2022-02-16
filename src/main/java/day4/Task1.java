package day4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        int n = s.nextInt();
        int[] massive = new int[n];

        for(int i=0; i<massive.length; i++){   // Заполнение массива
            massive[i] = rand.nextInt(10);
        }

        for(int forch:massive){        // Вывод массива на экран
            System.out.print(forch+" ");
        }
        System.out.println();
        System.out.println("Длина массива: "+massive.length);

        int counter = 0;

        for (int forch: massive){
            if(forch>8) counter++;
        }
        System.out.println("Количество чисел больше 8: "+counter);
        counter = 0;

        for (int forch: massive){
            if(forch==1) counter++;
        }
        System.out.println("Количество чисел равных 1: "+counter);
        counter = 0;

        for (int forch: massive){
            if(forch%2==0) counter++;
        }
        System.out.println("Количество четных чисел: "+counter);
        System.out.println("Количество нечетных чисел: "+(massive.length-counter));
        counter = 0;

        for (int forch: massive){
            counter+=forch;
        }
        System.out.println("Сумма элементов массива: "+counter);


    }
}
