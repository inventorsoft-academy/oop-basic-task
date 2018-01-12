package co.inventorsoft.oop.task.area;

import co.inventorsoft.oop.task.shapes.Shape;

import java.util.List;

// TODO: 1/10/2018 Implement area calculation for underlying shapes
public class ComplexShape {

    private List<Shape> shapes;

    public ComplexShape(List<Shape> shapes) {
        this.shapes = shapes;
    }


    public double area() {
        double area = 0.0;
        for (Shape shape : shapes) {
            area += shape.area();
        }
        return area;
    }
}
