package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "src/main/resources/";
        File shoes = new File(path+"shoes.csv");
        File missingShoes = new File(path+"missing_shoes.txt");
        missingShoes.getParentFile().mkdirs();
        Scanner scanner;

        try {
            PrintWriter pw = new PrintWriter(missingShoes);
            scanner = new Scanner(shoes);
            while (scanner.hasNextLine()) {
                String File = scanner.nextLine();
                String[] masShoes = File.split(";");
                if (masShoes.length != 3)
                    throw new IllegalArgumentException("Некорректный входной файл");
                if(Integer.parseInt(masShoes[2]) == 0)
                    pw.println(File);
            }
            pw.close();
            scanner.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
