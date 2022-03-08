package day12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int[] mas30 = new int[30];
        int[] mas350 = new int[50];

        // Знаю, тут говнокод немного, но я так понял это задание сделано как раз для экспериментов и баловства :)

        for (int i = 0; i < mas30.length; i++){
            mas30[i] = i;
        }
        for (int i = 0; i < mas350.length; i++){
            mas350[i] = 300+i;
        }
        int[] both = IntStream.concat(Arrays.stream(mas30), Arrays.stream(mas350)).toArray();
        List<Integer> list = Arrays.stream(both).boxed().collect(Collectors.toList());

        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0)
                even.add(x);
        }

        System.out.println(even);
    }
}
