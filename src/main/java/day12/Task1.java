package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carModel = new ArrayList<>(Arrays.asList("Tesla", "KIA", "Land Rover", "Alfa Romeo", "BMW" ));
        System.out.println(carModel);
        carModel.add(3,"Toyota");
        carModel.remove(0);
        System.out.println(carModel);
    }
}
