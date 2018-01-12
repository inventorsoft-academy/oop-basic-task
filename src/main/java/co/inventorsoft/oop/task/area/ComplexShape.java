package co.inventorsoft.oop.task.area;

import co.inventorsoft.oop.task.shapes.CalculateAreaFigure;

import java.util.ArrayList;
import java.util.List;

// TODO: 1/10/2018 Implement area calculation for underlying shapes
public class ComplexShape {

    private List<CalculateAreaFigure> shapes = new ArrayList<>();


    public ComplexShape(List<CalculateAreaFigure> shapes) {
        this.shapes = shapes;
    }


    public double area() {
        double areaShapes = 0;
        for (CalculateAreaFigure calculateAreaFigure :
        shapes){
            areaShapes += calculateAreaFigure.area();
        }
        return areaShapes;
    }
}
