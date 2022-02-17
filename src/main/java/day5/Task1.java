package day5;

public class Task1 {
    public static void main(String[] args) {
        Car Tesla = new Car();
        Tesla.setColor("white");
        Tesla.setModel("X");
        Tesla.setYear(2022);

        System.out.println("Цвет автомобиля: "+Tesla.getColor());
        System.out.println("Модель автомобиля: "+Tesla.getModel());
        System.out.println("Год выпуска: "+Tesla.getYear());

    }
}

class Car {
    private String Model;
    private String Color;
    private int year;

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
