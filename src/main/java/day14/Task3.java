package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day14/people");
        System.out.println(parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList(File file) {
        Scanner scanner;
        List<Person> nameList = new ArrayList<>();

        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    String[] nameLine = line.split(" ");
                    if(Integer.parseInt(nameLine[1]) < 0)
                        throw new IllegalArgumentException();
                    Person person = new Person(nameLine[0], Integer.parseInt(nameLine[1]));
                    nameList.add(person);

            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            nameList.clear();
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return nameList;
    }
}

class Person{
    private String name;
    private int year;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

