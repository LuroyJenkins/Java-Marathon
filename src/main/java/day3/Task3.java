package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double devident;
        double devider;

        for (int i = 5; i>0; i--){
            devident = s.nextDouble();
            devider = s.nextDouble();

            if(devider==0){
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(devident/devider);
        }
    }
}
