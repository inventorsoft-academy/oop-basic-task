package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define height and width and expose method to calculate the area
public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle() {
        this.a = 5.3;
        this.b = 7.94;
    }

    @Override
    public double area() {
        return a * b;
    }
}
