package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("boeing", 2013, 240, 20000);

        plane.setYear(2010);
        plane.setLength(260);
        plane.fillUp(150);
        plane.fillUp(250);
        plane.info();
    }
}
