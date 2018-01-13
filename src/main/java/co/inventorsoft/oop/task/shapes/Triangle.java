package co.inventorsoft.oop.task.shapes;

import main.java.co.inventorsoft.oop.task.shapes.MegaShape;

// TODO: 1/10/2018 This class need to define base and height and expose method to calculate the area
public class Triangle implements MegaShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() {
        return (base* height)/2;
    }
}
