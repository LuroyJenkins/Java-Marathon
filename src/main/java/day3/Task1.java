package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String town = s.nextLine();

        while (true) {
            if (town.equals("STOP")) {
                break;
            }
            switch (town) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
