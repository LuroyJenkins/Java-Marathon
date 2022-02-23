package day9.Task2;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();

    public String getColor() {
        return color;
    }
}
