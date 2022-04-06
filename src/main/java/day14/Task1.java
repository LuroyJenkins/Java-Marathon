package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day14/Test");
        printSumDigits(file);

    }

    public static void printSumDigits (File file){
        Scanner scanner = null;
        int sum = 0;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        String File = scanner.nextLine();
        String[] numbers = File.split(" ");

        try {
            if (numbers.length != 10)
                throw new IllegalArgumentException();
            for (String number: numbers) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
        }
        catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
    }
}

