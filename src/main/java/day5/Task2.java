package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorcycle m0 = new Motorcycle();
        Motorcycle m1 = new Motorcycle("Suzuki");
        Motorcycle m2 = new Motorcycle("Harley", "Red");
        Motorcycle m3 = new Motorcycle("Honda", "Black", 2021 );
    }
}

class Motorcycle{
    private String Model;
    private String Color;
    private int year;

    public Motorcycle(){               // конструктор по умолчанию, вызывается когда никакие параметры не передаются
        this.Model = "default";
        this.Color = "default";
        this.year = 0;
        System.out.println("Default constructor!");
    }
    public Motorcycle(String Model){     // 1 параметр
        this.Model = Model;
        this.Color = "default";
        this.year = 0;
        System.out.println("1 param constructor!");
    }
    public Motorcycle(String Model, String Color){     // 2 параметра
        this.Model = Model;
        this.Color = Color;
        this.year = 0;
        System.out.println("2 params constructor!");
    }
    public Motorcycle(String Model, String Color, int year){  // 3 параметра
        this.Model = Model;
        this.Color = Color;
        this.year = year;
        System.out.println("3 params constructor!");
    }

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
