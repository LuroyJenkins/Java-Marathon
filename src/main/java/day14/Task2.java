package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day14/people");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file){
        Scanner scanner;
        List<String> nameList = new ArrayList<>();

        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                try{
                    String line = scanner.nextLine();
                    String[] nameLine = line.split(" ");
                    if(Integer.parseInt(nameLine[1]) < 0)
                        throw new IllegalArgumentException();
                    nameList.add(line);
                }
                catch(IllegalArgumentException e){
                    System.out.println("Некорректный входной файл");
                    nameList.clear();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return nameList;
    }
}
