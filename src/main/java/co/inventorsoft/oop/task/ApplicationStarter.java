package co.inventorsoft.oop.task;

import co.inventorsoft.oop.task.area.ComplexShape;
import co.inventorsoft.oop.task.shapes.*;

import java.util.Arrays;
import java.util.List;

public class ApplicationStarter {

    public static void main(String[] args) {
        final List<CalculateAreaFigure> shapes = Arrays.asList(new Circle(4),
                                                        new Square(3),
                                                          new Rectangle(3,4),
                                                            new Triangle(3,4));
        final ComplexShape complexShape = new ComplexShape(shapes);
        System.out.printf("Complex shape area = %f", complexShape.area());
    }
}
