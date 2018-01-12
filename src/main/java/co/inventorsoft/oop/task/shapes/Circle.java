package co.inventorsoft.oop.task.shapes;

import co.inventorsoft.oop.task.area.Shape;
import static java.lang.Math.*;

// TODO: 1/10/2018 This class need to define radius and expose method to calculate the area
public class Circle implements Shape{

    private int r;

    public Circle(int r) {
        this.r = r;

        if (r <= 0) {
            System.out.println("Please enter a positive value!");
            System.exit(3);
        }

    }


    @Override
    public double calculateArea() {
        return PI*pow(r,2);
    }
}
