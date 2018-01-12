package co.inventorsoft.oop.task.area;

import co.inventorsoft.oop.task.shapes.Circle;
import co.inventorsoft.oop.task.shapes.Rectangle;
import co.inventorsoft.oop.task.shapes.Square;
import co.inventorsoft.oop.task.shapes.Triangle;

import java.util.List;

// TODO: 1/10/2018 Implement area calculation for underlying shapes
public class ComplexShape {

    private List<?> shapes;

    public ComplexShape(List<Object> shapes) {
        this.shapes = shapes;
    }


    public double area() {
        double area=0;
        for (Object sh: shapes){
            if (sh instanceof Circle){
                area += ((Circle) sh).area();
            }
            else if (sh instanceof Rectangle){
                area += ((Rectangle) sh).area();
            }
            else if (sh instanceof Square){
                area += ((Square) sh).area();
            }
            else if (sh instanceof Triangle){
                area += ((Triangle) sh).area();
            }
        }
        return area;
    }
}
