package co.inventorsoft.oop.task;

import co.inventorsoft.oop.task.area.ComplexShape;
import co.inventorsoft.oop.task.shapes.*;

import java.util.Arrays;
import java.util.List;

public class ApplicationStarter {

    public static void main(String[] args) {
        final List<Shape> shapes = Arrays.asList(new Circle(3), new Square(3.5),
                new Rectangle(4,3), new Triangle(5,3.8));
        final ComplexShape complexShape = new ComplexShape(shapes);
        System.out.printf("Complex shape area = %f", complexShape.area());
    }
}
