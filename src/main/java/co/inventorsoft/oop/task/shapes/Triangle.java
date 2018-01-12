package co.inventorsoft.oop.task.shapes;

import co.inventorsoft.oop.task.area.Shape;
import static java.lang.Math.sqrt;

// TODO: 1/10/2018 This class need to define base and height and eapose method to calculate the area
public class Triangle implements Shape{

    private int a,b,c;

    public Triangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (!checkLengthSides(a, b, c)) {
            System.out.println("Your triangle sides not correct!");
            System.exit(1);
        }

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Please enter a positive value!");
            System.exit(3);
        }
    }

    private boolean checkLengthSides (int a, int b, int c) {
        return a + b >= c && a + c >= b && b + c >= a;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
