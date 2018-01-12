package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define base and height and expose method to calculate the area
public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this.a = 3.6;
        this.b = 2.95;
        this.c = 4.13;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
