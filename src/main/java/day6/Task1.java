package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "White", 2014);
        Motorbike bike = new Motorbike("Harley-Davidson", "Black", 2020);

        car.yearDifference(2020);
        car.info();
        bike.yearDifference(2000);
        bike.info();
    }
}
