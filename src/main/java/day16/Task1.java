package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    File file = new File("src/main/java/day16/Test");
    printResult(file);
    }

    public static void printResult(File file){
        Scanner scanner;
        int sum = 0;
        int count = 0;

        try {
            scanner = new Scanner(file);
            String f = scanner.nextLine();
            String[] numbers = f.split(" ");
            for (String number: numbers) {
                sum += Integer.parseInt(number);
                count++;
            }

            System.out.printf((double) sum/count + " --> %.3f", (double) sum/count );
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

