package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define length and expose method to calculate the area
public class Square {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        double side = length/4;
        return side*side;
    }
}
