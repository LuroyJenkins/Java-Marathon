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
        file1.getParentFile().mkdirs();
        file2.getParentFile().mkdirs();

    StringBuilder str = new StringBuilder();
    int[] numbers = new int[1000];
    int sum = 0;
    Random rand = new Random();
    PrintWriter pw = new PrintWriter(file1);

    for(int i = 0; i<=999; i++){
        numbers[i] = rand.nextInt(100);
        str.append(numbers[i]+" ");
    }

    pw.println(str);
    pw.close();
    str.setLength(0);

    for(int i = 0; i<=49; i++){
        for(int j=0; j<=19; j++){
            sum+=numbers[(i+1)*(j+1)-1];
        }
        str.append((double) sum/20 + " ");
        sum = 0;
    }

    pw = new PrintWriter(file2);
    pw.println(str);
    pw.close();

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
