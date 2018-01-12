package co.inventorsoft.oop.task.shapes;

import co.inventorsoft.oop.task.area.Shape;

// TODO: 1/10/2018 This class need to define height and width and expose method to calculate the area
public class Rectangle implements Shape{

    private int a,b;

    public Rectangle (int a, int b) {
        this.a = a;
        this.b = b;

        if (a == b) {
            System.out.println("Your rectangle is equilateral and it's a Square!");
            System.exit(2);
        }

        if (a <= 0 || b <= 0) {
            System.out.println("Please enter a positive value!");
            System.exit(3);
        }
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
