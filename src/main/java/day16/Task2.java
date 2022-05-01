package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/main/resources/file1.txt");
        File file2 = new File("src/main/resources/file2.txt");

        StringBuilder str = new StringBuilder();
        Random rand = new Random();
        PrintWriter pw = new PrintWriter(file1);

        for (int i = 0; i < 1000; i++)
            pw.println(rand.nextInt(100));

        pw.close();

        Scanner scanner = new Scanner(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter == 20) {
                pw2.println(sum / 20.0);

                counter = 0;
                sum = 0;
            }
        }

        pw2.close();
    printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        double sum = 0;
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        for (String number: numbers) {
            sum += Double.parseDouble(number);
        }
        System.out.println((int) sum);
    }
}
