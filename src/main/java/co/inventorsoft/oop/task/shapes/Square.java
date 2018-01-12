package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define length and expose method to calculate the area
public class Square implements Shape {
    private double a;

    public Square() {
        this.a = 4.25;
    }

    @Override
    public double area() {
        return a * a;
    }
}
