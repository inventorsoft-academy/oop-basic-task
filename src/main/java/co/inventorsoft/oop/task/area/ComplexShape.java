package co.inventorsoft.oop.task.area;

import main.java.co.inventorsoft.oop.task.shapes.MegaShape;

import java.util.List;

// TODO: 1/10/2018 Implement area calculation for underlying shapes
public class ComplexShape {

    private List<MegaShape> shapes;

    public ComplexShape(List<MegaShape> shapes) {
        this.shapes = shapes;
    }


    public double area() {
        double area = 0.0;
        for (MegaShape ms : shapes) {
            area += ms.area();
        }
        return area;
    }
}
