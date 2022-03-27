package day12;

import java.util.List;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        createArrayList(list, 0, 30);
        createArrayList(list, 300, 350);

        showArrayList(list);
    }

    public static void createArrayList(List<Integer> list, int start_num, int finish_num) {
        for (int i = start_num; i<=finish_num; i++){
            list.add(i);
        }
    }

    public static void showArrayList(List<Integer> list){
        for(Integer x: list){
            System.out.println(list.get(x));
        }
    }
}
