package day9.Task2;

public class Triangle extends Figure{
    private double l_first;
    private double l_second;
    private double l_third;

    public Triangle(double l_first, double l_second, double l_third, String color ) {
        super(color);
        this.l_first = l_first;
        this.l_second = l_second;
        this.l_third = l_third;
    }

    @Override
    public double area(){
        double p = ((l_first+l_second+l_third)/ 2);
        return Math.sqrt(p*(p-l_first)*(p-l_second)*(p-l_third));
    }

    @Override
    public double perimeter(){
        return l_first+l_second+l_third;
    }
}
