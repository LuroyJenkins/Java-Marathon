package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double devident;
        double devider;

        while (true) {
            devident = s.nextDouble();
            devider = s.nextDouble();

            if (devider == 0)
                break;

            System.out.println(devident/devider);
        }
    }
}
