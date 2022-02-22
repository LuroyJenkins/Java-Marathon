package day7;

public class Airplane {
    String manufacturer;
    int year, length, weight, fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель: "+manufacturer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+", количество топлива в баке: "+fuel);
    }

    public int fillUp(int n){
        fuel += n;
        return fuel;
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2){
        if(plane1.length > plane2.length) System.out.println("Первый самолет длиннее");
        else if (plane2.length > plane1.length) System.out.println("Второй самолет длиннее");
        else System.out.println("Длины самолетов равны");
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
