package day6;

public class Motorbike {
    private String Model;
    private String Color;
    private int year;

    public Motorbike(){               // конструктор по умолчанию, вызывается когда никакие параметры не передаются
        this.Model = "default";
        this.Color = "default";
        this.year = 0;
    }
    public Motorbike(String Model){     // 1 параметр
        this.Model = Model;
        this.Color = "default";
        this.year = 0;
    }
    public Motorbike(String Model, String Color){     // 2 параметра
        this.Model = Model;
        this.Color = Color;
        this.year = 0;
    }
    public Motorbike(String Model, String Color, int year){  // 3 параметра
        this.Model = Model;
        this.Color = Color;
        this.year = year;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear-year);
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
