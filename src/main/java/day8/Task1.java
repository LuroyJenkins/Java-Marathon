package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "";
        StringBuilder sb = new StringBuilder();

        // Конкатенация строк:
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++){
            string.concat(" "+i);
        }
        System.out.println(string);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы в мс.: "+(stopTime - startTime));


        // StringBuilder:
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++){
            sb.append(i+" ");
        }
        System.out.println(sb);
        stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы в мс.: "+(stopTime - startTime));
    }
}
