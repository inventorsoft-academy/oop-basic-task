package co.inventorsoft.oop.task;

import co.inventorsoft.oop.task.area.ComplexShape;
import co.inventorsoft.oop.task.shapes.*;

import java.util.Arrays;
import java.util.List;

public class ApplicationStarter {

    public static void main(String[] args) {
        final List<Shape> shapes = Arrays.asList(
                new Circle(5.47),
                new Square(7.2),
                new Rectangle(2.85, 5.89),
                new Triangle(3.48, 2.26, 4.18));
        final ComplexShape complexShape = new ComplexShape(shapes);
        System.out.printf("Complex shape area = %f", complexShape.area());
    }
}
