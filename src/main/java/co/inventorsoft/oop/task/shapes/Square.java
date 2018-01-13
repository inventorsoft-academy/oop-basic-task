package co.inventorsoft.oop.task.shapes;

import main.java.co.inventorsoft.oop.task.shapes.MegaShape;

// TODO: 1/10/2018 This class need to define length and expose method to calculate the area
public class Square implements MegaShape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        double side = length/4;
        return side*side;
    }
}
