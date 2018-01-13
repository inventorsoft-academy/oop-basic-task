package co.inventorsoft.oop.task.shapes;

import main.java.co.inventorsoft.oop.task.shapes.MegaShape;

// TODO: 1/10/2018 This class need to define radius and expose method to calculate the area
public class Circle implements MegaShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return  Math.PI * (radius * radius);
    }
}
